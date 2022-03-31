package gg.objects;

import javax.xml.bind.annotation.XmlElement;


/**
 * This Project class is responsible for setting the corresponding XML child tags of the project to their corresponding object variables
 * @author Carprece R. Revis
 *
 */
public class Project 
{

	private String title;
	private String summary;
	private String status;
	private String contactName;
	private String contactAddress;
	private String contactAddress2;
	private String contactCity;
	private String contactCountry;
	private String contactPostal;
	private String contactState;
	private String contactTitle;
	private String contactUrl;
	public String getTitle() {
		return title;
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	
	@XmlElement
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStatus() {
		return status;
	}
	
	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getContactAddress2() {
		return contactAddress2;
	}
	public void setContactAddress2(String contactAddress2) {
		this.contactAddress2 = contactAddress2;
	}
	public String getContactCity() {
		return contactCity;
	}
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}
	public String getContactCountry() {
		return contactCountry;
	}
	public void setContactCountry(String contactCountry) {
		this.contactCountry = contactCountry;
	}
	public String getContactPostal() {
		return contactPostal;
	}
	public void setContactPostal(String contactPostal) {
		this.contactPostal = contactPostal;
	}
	public String getContactState() {
		return contactState;
	}
	public void setContactState(String contactState) {
		this.contactState = contactState;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public String getContactUrl() {
		return contactUrl;
	}
	public void setContactUrl(String contactUrl) {
		this.contactUrl = contactUrl;
	}









}
