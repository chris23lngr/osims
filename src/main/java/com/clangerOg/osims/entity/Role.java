package com.clangerOg.osims.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public enum Role {
    USER,
    ADMIN,
    SUPER_ADMIN,
}