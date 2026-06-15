package com.dhiware.attendance_monitoring.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BrowserLauncher {

    @EventListener(ApplicationReadyEvent.class)
    public void launchBrowser() {

        try {

            Runtime.getRuntime().exec(
                "rundll32 url.dll,FileProtocolHandler http://localhost:8081"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}