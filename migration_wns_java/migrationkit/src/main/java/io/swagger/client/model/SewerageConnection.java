/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * SewerageConnection
 */

public class SewerageConnection extends Connection {
  @JsonProperty("noOfWaterClosets")
  private BigDecimal noOfWaterClosets = null;

  @JsonProperty("proposedWaterClosets")
  private BigDecimal proposedWaterClosets = null;

  @JsonProperty("noOfToilets")
  private BigDecimal noOfToilets = null;

  @JsonProperty("proposedToilets")
  private BigDecimal proposedToilets = null;
  
  @JsonProperty("processInstance")
  private ProcessInstance processInstance = null;
 
  public ProcessInstance getProcessInstance() {
	return processInstance;
}

public void setProcessInstance(ProcessInstance processInstance) {
	this.processInstance = processInstance;
}

  public SewerageConnection noOfWaterClosets(BigDecimal noOfWaterClosets) {
    this.noOfWaterClosets = noOfWaterClosets;
    return this;
  }

   /**
   * Get noOfWaterClosets
   * @return noOfWaterClosets
  **/
  public BigDecimal getNoOfWaterClosets() {
    return noOfWaterClosets;
  }

  public void setNoOfWaterClosets(BigDecimal noOfWaterClosets) {
    this.noOfWaterClosets = noOfWaterClosets;
  }

  public SewerageConnection proposedWaterClosets(BigDecimal proposedWaterClosets) {
    this.proposedWaterClosets = proposedWaterClosets;
    return this;
  }

   /**
   * Get proposedWaterClosets
   * @return proposedWaterClosets
  **/
  public BigDecimal getProposedWaterClosets() {
    return proposedWaterClosets;
  }

  public void setProposedWaterClosets(BigDecimal proposedWaterClosets) {
    this.proposedWaterClosets = proposedWaterClosets;
  }

  public SewerageConnection noOfToilets(BigDecimal noOfToilets) {
    this.noOfToilets = noOfToilets;
    return this;
  }

   /**
   * Get noOfToilets
   * @return noOfToilets
  **/
  public BigDecimal getNoOfToilets() {
    return noOfToilets;
  }

  public void setNoOfToilets(BigDecimal noOfToilets) {
    this.noOfToilets = noOfToilets;
  }

  public SewerageConnection proposedToilets(BigDecimal proposedToilets) {
    this.proposedToilets = proposedToilets;
    return this;
  }

   /**
   * Get proposedToilets
   * @return proposedToilets
  **/
  public BigDecimal getProposedToilets() {
    return proposedToilets;
  }

  public void setProposedToilets(BigDecimal proposedToilets) {
    this.proposedToilets = proposedToilets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SewerageConnection sewerageConnection = (SewerageConnection) o;
    return Objects.equals(this.noOfWaterClosets, sewerageConnection.noOfWaterClosets) &&
        Objects.equals(this.proposedWaterClosets, sewerageConnection.proposedWaterClosets) &&
        Objects.equals(this.noOfToilets, sewerageConnection.noOfToilets) &&
        Objects.equals(this.proposedToilets, sewerageConnection.proposedToilets) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noOfWaterClosets, proposedWaterClosets, noOfToilets, proposedToilets, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SewerageConnection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    noOfWaterClosets: ").append(toIndentedString(noOfWaterClosets)).append("\n");
    sb.append("    proposedWaterClosets: ").append(toIndentedString(proposedWaterClosets)).append("\n");
    sb.append("    noOfToilets: ").append(toIndentedString(noOfToilets)).append("\n");
    sb.append("    proposedToilets: ").append(toIndentedString(proposedToilets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
