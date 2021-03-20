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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * WaterConnection
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@SuperBuilder
public class WaterConnection extends Connection {
	@JsonProperty("rainWaterHarvesting")
	private Boolean rainWaterHarvesting = null;

	@JsonProperty("waterSource")
	private String waterSource = null;

	@JsonProperty("meterId")
	private String meterId = null;

	@JsonProperty("meterInstallationDate")
	private Long meterInstallationDate = null;

	@JsonProperty("proposedPipeSize")
	private Double proposedPipeSize = null;

	@JsonProperty("actualPipeSize")
	private Double pipeSize = null;

	@JsonProperty("proposedTaps")
	private Double proposedTaps = null;

	@JsonProperty("noOfTaps")
	private Double noOfTaps = null;
	@JsonProperty("applicantaddress")
	private Address applicantAddress = null;

	@JsonProperty("propertyType")
	private String propertyType = null;

	@JsonProperty("applicationType")
	private String applicationType = null;
	
	@JsonProperty("plotSize")
	private Integer plotSize = null;

	@JsonProperty("processInstance")
	private ProcessInstance processInstance = null;

	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public Boolean getRainWaterHarvesting() {
		return rainWaterHarvesting;
	}

	@JsonProperty("documents")
	private List<Document> documents = null;

	public WaterConnection rainWaterHarvesting(Boolean rainWaterHarvesting) {
		this.rainWaterHarvesting = rainWaterHarvesting;
		return this;
	}

	/**
	 * Get rainWaterHarvesting
	 * 
	 * @return rainWaterHarvesting
	 **/
	public Boolean isRainWaterHarvesting() {
		return rainWaterHarvesting;
	}

	public void setRainWaterHarvesting(Boolean rainWaterHarvesting) {
		this.rainWaterHarvesting = rainWaterHarvesting;
	}

	public WaterConnection waterSource(String waterSource) {
		this.waterSource = waterSource;
		return this;
	}

	/**
	 * It is a namespaced master data, defined in MDMS
	 * 
	 * @return waterSource
	 **/
	public String getWaterSource() {
		return waterSource;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public WaterConnection meterId(String meterId) {
		this.meterId = meterId;
		return this;
	}

	/**
	 * Unique id of the meter.
	 * 
	 * @return meterId
	 **/
	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public WaterConnection meterInstallationDate(Long meterInstallationDate) {
		this.meterInstallationDate = meterInstallationDate;
		return this;
	}

	/**
	 * The date of meter installation date.
	 * 
	 * @return meterInstallationDate
	 **/
	public Long getMeterInstallationDate() {
		return meterInstallationDate;
	}

	public void setMeterInstallationDate(Long meterInstallationDate) {
		this.meterInstallationDate = meterInstallationDate;
	}

	public WaterConnection proposedPipeSize(Double proposedPipeSize) {
		this.proposedPipeSize = proposedPipeSize;
		return this;
	}

	/**
	 * proposed size of the pipe which will be use to provide the connection.
	 * 
	 * @return proposedPipeSize
	 **/
	public Double getProposedPipeSize() {
		return proposedPipeSize;
	}

	public void setProposedPipeSize(Double proposedPipeSize) {
		this.proposedPipeSize = proposedPipeSize;
	}

	/**
	 * Actual pipe size which used in the water connection.
	 * 
	 * @return actualPipeSize
	 **/

	public WaterConnection proposedTaps(Double proposedTaps) {
		this.proposedTaps = proposedTaps;
		return this;
	}

	/**
	 * proposed number of the taps.
	 * 
	 * @return proposedTaps
	 **/
	public Double getProposedTaps() {
		return proposedTaps;
	}

	public void setProposedTaps(Double proposedTaps) {
		this.proposedTaps = proposedTaps;
	}

	/**
	 * Actual number of the taps
	 * 
	 * @return actualTaps
	 **/

	@Override
	public WaterConnection documents(List<Document> documents) {
		this.documents = documents;
		return this;
	}

	@Override
	public WaterConnection addDocumentsItem(Document documentsItem) {
		if (this.documents == null) {
			this.documents = new ArrayList<Document>();
		}
		this.documents.add(documentsItem);
		return this;
	}

	/**
	 * The documents attached by owner for exemption.
	 * 
	 * @return documents
	 **/
	@Override
	public List<Document> getDocuments() {
		return documents;
	}

	@Override
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WaterConnection waterConnection = (WaterConnection) o;
		return Objects.equals(this.rainWaterHarvesting, waterConnection.rainWaterHarvesting)
				&& Objects.equals(this.waterSource, waterConnection.waterSource)
				&& Objects.equals(this.meterId, waterConnection.meterId)
				&& Objects.equals(this.meterInstallationDate, waterConnection.meterInstallationDate)
				&& Objects.equals(this.proposedPipeSize, waterConnection.proposedPipeSize)
				&& Objects.equals(this.pipeSize, waterConnection.pipeSize)
				&& Objects.equals(this.proposedTaps, waterConnection.proposedTaps)
				&& Objects.equals(this.noOfTaps, waterConnection.noOfTaps)
				&& Objects.equals(this.documents, waterConnection.documents) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rainWaterHarvesting, waterSource, meterId, meterInstallationDate, proposedPipeSize,
				pipeSize, proposedTaps, noOfTaps, documents, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WaterConnection {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    rainWaterHarvesting: ").append(toIndentedString(rainWaterHarvesting)).append("\n");
		sb.append("    waterSource: ").append(toIndentedString(waterSource)).append("\n");
		sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
		sb.append("    meterInstallationDate: ").append(toIndentedString(meterInstallationDate)).append("\n");
		sb.append("    proposedPipeSize: ").append(toIndentedString(proposedPipeSize)).append("\n");
		sb.append("    actualPipeSize: ").append(toIndentedString(pipeSize)).append("\n");
		sb.append("    proposedTaps: ").append(toIndentedString(proposedTaps)).append("\n");
		sb.append("    actualTaps: ").append(toIndentedString(noOfTaps)).append("\n");
		sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

	public Address getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(Address applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

}
