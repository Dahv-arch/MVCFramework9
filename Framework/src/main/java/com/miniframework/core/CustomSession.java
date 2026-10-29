package com.miniframework.core;

import jakarta.servlet.http.HttpSession;

public class CustomSession {

    private HttpSession session;

    public CustomSession() { }

    public CustomSession(HttpSession session) { this.session = session; }

    private HttpSession requireSession() {
        if (session == null) {
            throw new IllegalStateException("Aucune session active (CustomSession sans HttpSession).");
        }
        return session;
    }

    public Object get(String key) { return requireSession().getAttribute(key); }

    public void set(String key, Object value) { requireSession().setAttribute(key, value); }

    public void remove(String key) { requireSession().removeAttribute(key); }

    public void invalidate() { requireSession().invalidate(); }

    public String getIdSession() { return requireSession().getId(); }
}