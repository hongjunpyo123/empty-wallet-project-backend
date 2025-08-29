package com.qoormthon.empty_wallet.global.security.core;

public enum Role {

  ROLE_USER("USER"),
  ROLE_ADMIN("ADMIN");
  private String role;

  Role(String role) {
    this.role = role;
  }

  public String getRole() {
    return this.role;
  }
}
