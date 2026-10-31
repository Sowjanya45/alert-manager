package com.democorp.bank;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "democorp")
public record DemocorpProperties(
        String ingestUrl,
        String ingestApiKey,
        String adminKey,
        boolean trafficEnabled,
        boolean directAlerts,
        int ticketDelaySeconds) {
}
