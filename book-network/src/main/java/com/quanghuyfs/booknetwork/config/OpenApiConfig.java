package com.quanghuyfs.booknetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(contact = @Contact(name = "quanghuyfs", email = "buiquanghuy0029a@gmail.com"),
                description = "OpenApi documentation for spring"
                , title = "OpenApi specification - Quang Huy",
                version = "1.0",
                license = @License(
                        name = "book-network",
                        url = "https://example.com"
                ), termsOfService = "Terms of service"
        ),
        servers = {
                @Server(description = "Local ENV",
                        url = "http://localhost:8088/api/v1")
                , @Server(description = "Product ENV",
                url = "https://quanghuyfs.com")
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)
public class OpenApiConfig {
}
