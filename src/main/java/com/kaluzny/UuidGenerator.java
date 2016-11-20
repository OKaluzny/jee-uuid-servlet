package com.kaluzny;

import java.util.UUID;

class UuidGenerator {

    String generate() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }
}