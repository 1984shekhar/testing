
package com.vodafone.group.contract.vbs.service.service_balance.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5.redhat-630283
 * 2017-12-07T13:57:53.203+01:00
 * Generated source version: 3.1.5.redhat-630283
 */

@WebFault(name = "Fault", targetNamespace = "http://group.vodafone.com/contract/vfo/fault/v1")
public class VodafoneFault extends Exception {
    
    private com.vodafone.group.contract.vfo.fault.v1.FaultType fault;

    public VodafoneFault() {
        super();
    }
    
    public VodafoneFault(String message) {
        super(message);
    }
    
    public VodafoneFault(String message, Throwable cause) {
        super(message, cause);
    }

    public VodafoneFault(String message, com.vodafone.group.contract.vfo.fault.v1.FaultType fault) {
        super(message);
        this.fault = fault;
    }

    public VodafoneFault(String message, com.vodafone.group.contract.vfo.fault.v1.FaultType fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.vodafone.group.contract.vfo.fault.v1.FaultType getFaultInfo() {
        return this.fault;
    }
}
