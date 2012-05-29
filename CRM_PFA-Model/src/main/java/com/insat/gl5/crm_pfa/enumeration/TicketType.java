/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insat.gl5.crm_pfa.enumeration;

/**
 *
 * @author Mounir Messelmeni <messelmeni.mounir@gmail.com>
 */
public enum TicketType {

    INCIDENT("Incident"),
    QUESTION("Question");
    private String displayName;

    private TicketType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
