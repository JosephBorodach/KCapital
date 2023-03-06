package com.KCapital.investments.tradingsystem.util.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * {@link PropertyUtil} is a util class for all things {@link Properties}.
 */
public class PropertyUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtil.class);

    public static final Map<String, Properties> CACHED_PROPERTIES = Collections.synchronizedMap(new HashMap<>());

    /**
     * Gets a string property from a property file. Will try to IO load the properties in the property file if not
     * cached already.
     *
     * @param propertyFile the property file
     * @param key          the key
     *
     * @return the string
     */
    public static String getProperty(String propertyFile, String key) {
        return getProperty(propertyFile, null, key, null);
    }

    /**
     * Gets a string property from a property file. Will try to IO load the properties in the property file if not
     * cached already. If the desired property is not found in the <code>propertyFile</code>, then the
     * <code>defaultPropertyFile</code> is searched.
     *
     * @param propertyFile        the property file
     * @param defaultPropertyFile the default property file
     * @param key                 the key
     *
     * @return the string
     */
    public static String getProperty(String propertyFile, String defaultPropertyFile, String key) {
        return getProperty(propertyFile, defaultPropertyFile, key, null);
    }

    /**
     * Gets a string property from a property file. Will try to IO load the properties in the property file if not
     * cached already. If the desired property is not found in the <code>propertyFile</code>, then the
     * <code>defaultPropertyFile</code> is searched, and if it's not there, then <code>defaultValue</code> is returned.
     *
     * @param propertyFile        the property file
     * @param defaultPropertyFile the default property file
     * @param key                 the key
     * @param defaultValue        the default value (if the desired property wasn't found, then this is returned)
     *
     * @return the string
     */
    public static String getProperty(String propertyFile, String defaultPropertyFile, String key, String defaultValue) {
        Properties properties;

        if (!CACHED_PROPERTIES.containsKey(propertyFile)) {
            properties = loadPropertyFile(propertyFile, defaultPropertyFile);
            CACHED_PROPERTIES.put(propertyFile, properties);
        } else {
            properties = CACHED_PROPERTIES.get(propertyFile);
        }

        return properties == null ? defaultValue : properties.getProperty(key, defaultValue);
    }

    /**
     * Loads property file {@link Properties}.
     *
     * @param propertyFile        the property file name
     * @param defaultPropertyFile the default property file name
     *
     * @return the properties
     */
    public synchronized static Properties loadPropertyFile(String propertyFile, String defaultPropertyFile) {
        ClassLoader classLoader = PropertyUtil.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }

        // Load the default property file if exists
        Properties defaultProperties = null;
        InputStream defaultPropertyStream = classLoader.getResourceAsStream(defaultPropertyFile);

        if (defaultPropertyStream != null) {
            defaultProperties = new Properties();

            // Load the properties
            try {
                defaultProperties.load(defaultPropertyStream);
                LOGGER.debug("Loaded default properties file: {}", defaultPropertyFile);
            } catch (IOException exception) {
                LOGGER.error("Could not load default property file: {}\n{}", defaultPropertyFile, exception);
            }

            // Close the InputStream
            try {
                defaultPropertyStream.close();
            } catch (IOException exception) {
                LOGGER.error("Could not close default property file stream: {}\n{}", defaultPropertyFile, exception);
            }

        } else {
            LOGGER.warn("No default property file found for: {}", propertyFile);
        }

        // Load the property file
        Properties properties = null;
        InputStream propertyStream = classLoader.getResourceAsStream(propertyFile);

        if (propertyStream != null) {
            // Add default properties if they were found
            properties = defaultProperties == null ? new Properties() : new Properties(defaultProperties);

            // Load the properties
            try {
                properties.load(propertyStream);
                LOGGER.info("Loaded properties file: {}", propertyFile);
            } catch (IOException exception) {
                LOGGER.error("Could not load property file: {}\n{}", propertyFile, exception);
            }

            // Close the InputStream
            try {
                propertyStream.close();
            } catch (IOException exception) {
                LOGGER.error("Could not close property file stream: {}\n{}", propertyFile, exception);
            }
        } else {
            LOGGER.debug("Could not find property file: {}", propertyFile);

            if (defaultProperties != null) {
                LOGGER.info("Using default properties for: {}", propertyFile);
                properties = defaultProperties;
            }
        }

        return properties;
    }
}
