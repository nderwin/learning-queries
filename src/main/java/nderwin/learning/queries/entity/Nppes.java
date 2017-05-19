/*
 * Copyright 2017 Nathan Erwin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nderwin.learning.queries.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nderwin
 */
@Entity
@Table(name = "nppes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(
            name = "Nppes.findAll", 
            query = "SELECT n FROM Nppes n WHERE "
                    + "(:npi IS NOT NULL AND LENGTH(:npi) > 0 AND n.npi = :npi) "
                    + "OR (:companyName IS NOT NULL AND LENGTH(:companyName) > 0 AND n.providerOrganizationNameLegalBusinessName = :companyName) "
                    + "OR (:lastName IS NOT NULL AND LENGTH(:lastName) > 0 AND n.providerLastNameLegalName = :lastName) "
                    + "OR (:firstName IS NOT NULL AND LENGTH(:firstName) > 0 AND n.providerFirstName = :firstName) "
                    + "ORDER BY n.providerLastNameLegalName, n.providerFirstName"
    )
})
public class Nppes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NPI")
    private String npi;

    @Size(max = 255)
    @Column(name = "Entity_Type_Code")
    private String entityTypeCode;

    @Size(max = 255)
    @Column(name = "Replacement_NPI")
    private String replacementNPI;

    @Size(max = 255)
    @Column(name = "Employer_Identification_Number__EIN")
    private String employerIdentificationNumberEIN;

    @Size(max = 255)
    @Column(name = "Provider_Organization_Name__Legal_Business_Name")
    private String providerOrganizationNameLegalBusinessName;

    @Size(max = 255)
    @Column(name = "Provider_Last_Name__Legal_Name")
    private String providerLastNameLegalName;

    @Size(max = 255)
    @Column(name = "Provider_First_Name")
    private String providerFirstName;

    @Size(max = 255)
    @Column(name = "Provider_Middle_Name")
    private String providerMiddleName;

    @Size(max = 255)
    @Column(name = "Provider_Name_Prefix_Text")
    private String providerNamePrefixText;

    @Size(max = 255)
    @Column(name = "Provider_Name_Suffix_Text")
    private String providerNameSuffixText;

    @Size(max = 255)
    @Column(name = "Provider_Credential_Text")
    private String providerCredentialText;

    @Size(max = 255)
    @Column(name = "Provider_Other_Organization_Name")
    private String providerOtherOrganizationName;

    @Size(max = 255)
    @Column(name = "Provider_Other_Organization_Name_Type_Code")
    private String providerOtherOrganizationNameTypeCode;

    @Size(max = 255)
    @Column(name = "Provider_Other_Last_Name")
    private String providerOtherLastName;

    @Size(max = 255)
    @Column(name = "Provider_Other_First_Name")
    private String providerOtherFirstName;

    @Size(max = 255)
    @Column(name = "Provider_Other_Middle_Name")
    private String providerOtherMiddleName;

    @Size(max = 255)
    @Column(name = "Provider_Other_Name_Prefix_Text")
    private String providerOtherNamePrefixText;

    @Size(max = 255)
    @Column(name = "Provider_Other_Name_Suffix_Text")
    private String providerOtherNameSuffixText;

    @Size(max = 255)
    @Column(name = "Provider_Other_Credential_Text")
    private String providerOtherCredentialText;

    @Size(max = 255)
    @Column(name = "Provider_Other_Last_Name_Type_Code")
    private String providerOtherLastNameTypeCode;

    @Size(max = 255)
    @Column(name = "Provider_First_Line_Business_Mailing_Address")
    private String providerFirstLineBusinessMailingAddress;

    @Size(max = 255)
    @Column(name = "Provider_Second_Line_Business_Mailing_Address")
    private String providerSecondLineBusinessMailingAddress;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_City_Name")
    private String providerBusinessMailingAddressCityName;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_State_Name")
    private String providerBusinessMailingAddressStateName;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_Postal_Code")
    private String providerBusinessMailingAddressPostalCode;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_Country_Code__If_outside_US")
    private String providerBusinessMailingAddressCountryCodeIfoutsideUS;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_Telephone_Number")
    private String providerBusinessMailingAddressTelephoneNumber;

    @Size(max = 255)
    @Column(name = "Provider_Business_Mailing_Address_Fax_Number")
    private String providerBusinessMailingAddressFaxNumber;

    @Size(max = 255)
    @Column(name = "Provider_First_Line_Business_Practice_Location_Address")
    private String providerFirstLineBusinessPracticeLocationAddress;

    @Size(max = 255)
    @Column(name = "Provider_Second_Line_Business_Practice_Location_Address")
    private String providerSecondLineBusinessPracticeLocationAddress;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_City_Name")
    private String providerBusinessPracticeLocationAddressCityName;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_State_Name")
    private String providerBusinessPracticeLocationAddressStateName;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_Postal_Code")
    private String providerBusinessPracticeLocationAddressPostalCode;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_Country_Code__If_ou")
    private String providerBusinessPracticeLocationAddressCountryCodeIfou;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_Telephone_Number")
    private String providerBusinessPracticeLocationAddressTelephoneNumber;

    @Size(max = 255)
    @Column(name = "Provider_Business_Practice_Location_Address_Fax_Number")
    private String providerBusinessPracticeLocationAddressFaxNumber;

    @Size(max = 255)
    @Column(name = "Provider_Enumeration_Date")
    private String providerEnumerationDate;

    @Size(max = 255)
    @Column(name = "Last_Update_Date")
    private String lastUpdateDate;

    @Size(max = 255)
    @Column(name = "NPI_Deactivation_Reason_Code")
    private String nPIDeactivationReasonCode;

    @Size(max = 255)
    @Column(name = "NPI_Deactivation_Date")
    private String nPIDeactivationDate;

    @Size(max = 255)
    @Column(name = "NPI_Reactivation_Date")
    private String nPIReactivationDate;

    @Size(max = 255)
    @Column(name = "Provider_Gender_Code")
    private String providerGenderCode;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Last_Name")
    private String authorizedOfficialLastName;

    @Size(max = 255)
    @Column(name = "Authorized_Official_First_Name")
    private String authorizedOfficialFirstName;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Middle_Name")
    private String authorizedOfficialMiddleName;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Title_or_Position")
    private String authorizedOfficialTitleorPosition;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Telephone_Number")
    private String authorizedOfficialTelephoneNumber;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_1")
    private String healthcareProviderTaxonomyCode1;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_1")
    private String providerLicenseNumber1;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_1")
    private String providerLicenseNumberStateCode1;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_1")
    private String healthcareProviderPrimaryTaxonomySwitch1;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_2")
    private String healthcareProviderTaxonomyCode2;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_2")
    private String providerLicenseNumber2;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_2")
    private String providerLicenseNumberStateCode2;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_2")
    private String healthcareProviderPrimaryTaxonomySwitch2;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_3")
    private String healthcareProviderTaxonomyCode3;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_3")
    private String providerLicenseNumber3;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_3")
    private String providerLicenseNumberStateCode3;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_3")
    private String healthcareProviderPrimaryTaxonomySwitch3;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_4")
    private String healthcareProviderTaxonomyCode4;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_4")
    private String providerLicenseNumber4;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_4")
    private String providerLicenseNumberStateCode4;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_4")
    private String healthcareProviderPrimaryTaxonomySwitch4;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_5")
    private String healthcareProviderTaxonomyCode5;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_5")
    private String providerLicenseNumber5;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_5")
    private String providerLicenseNumberStateCode5;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_5")
    private String healthcareProviderPrimaryTaxonomySwitch5;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_6")
    private String healthcareProviderTaxonomyCode6;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_6")
    private String providerLicenseNumber6;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_6")
    private String providerLicenseNumberStateCode6;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_6")
    private String healthcareProviderPrimaryTaxonomySwitch6;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_7")
    private String healthcareProviderTaxonomyCode7;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_7")
    private String providerLicenseNumber7;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_7")
    private String providerLicenseNumberStateCode7;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_7")
    private String healthcareProviderPrimaryTaxonomySwitch7;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_8")
    private String healthcareProviderTaxonomyCode8;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_8")
    private String providerLicenseNumber8;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_8")
    private String providerLicenseNumberStateCode8;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_8")
    private String healthcareProviderPrimaryTaxonomySwitch8;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_9")
    private String healthcareProviderTaxonomyCode9;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_9")
    private String providerLicenseNumber9;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_9")
    private String providerLicenseNumberStateCode9;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_9")
    private String healthcareProviderPrimaryTaxonomySwitch9;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_10")
    private String healthcareProviderTaxonomyCode10;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_10")
    private String providerLicenseNumber10;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_10")
    private String providerLicenseNumberStateCode10;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_10")
    private String healthcareProviderPrimaryTaxonomySwitch10;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_11")
    private String healthcareProviderTaxonomyCode11;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_11")
    private String providerLicenseNumber11;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_11")
    private String providerLicenseNumberStateCode11;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_11")
    private String healthcareProviderPrimaryTaxonomySwitch11;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_12")
    private String healthcareProviderTaxonomyCode12;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_12")
    private String providerLicenseNumber12;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_12")
    private String providerLicenseNumberStateCode12;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_12")
    private String healthcareProviderPrimaryTaxonomySwitch12;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_13")
    private String healthcareProviderTaxonomyCode13;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_13")
    private String providerLicenseNumber13;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_13")
    private String providerLicenseNumberStateCode13;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_13")
    private String healthcareProviderPrimaryTaxonomySwitch13;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_14")
    private String healthcareProviderTaxonomyCode14;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_14")
    private String providerLicenseNumber14;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_14")
    private String providerLicenseNumberStateCode14;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_14")
    private String healthcareProviderPrimaryTaxonomySwitch14;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Code_15")
    private String healthcareProviderTaxonomyCode15;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_15")
    private String providerLicenseNumber15;

    @Size(max = 255)
    @Column(name = "Provider_License_Number_State_Code_15")
    private String providerLicenseNumberStateCode15;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Primary_Taxonomy_Switch_15")
    private String healthcareProviderPrimaryTaxonomySwitch15;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_1")
    private String otherProviderIdentifier1;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_1")
    private String otherProviderIdentifierTypeCode1;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_1")
    private String otherProviderIdentifierState1;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_1")
    private String otherProviderIdentifierIssuer1;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_2")
    private String otherProviderIdentifier2;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_2")
    private String otherProviderIdentifierTypeCode2;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_2")
    private String otherProviderIdentifierState2;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_2")
    private String otherProviderIdentifierIssuer2;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_3")
    private String otherProviderIdentifier3;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_3")
    private String otherProviderIdentifierTypeCode3;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_3")
    private String otherProviderIdentifierState3;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_3")
    private String otherProviderIdentifierIssuer3;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_4")
    private String otherProviderIdentifier4;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_4")
    private String otherProviderIdentifierTypeCode4;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_4")
    private String otherProviderIdentifierState4;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_4")
    private String otherProviderIdentifierIssuer4;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_5")
    private String otherProviderIdentifier5;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_5")
    private String otherProviderIdentifierTypeCode5;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_5")
    private String otherProviderIdentifierState5;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_5")
    private String otherProviderIdentifierIssuer5;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_6")
    private String otherProviderIdentifier6;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_6")
    private String otherProviderIdentifierTypeCode6;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_6")
    private String otherProviderIdentifierState6;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_6")
    private String otherProviderIdentifierIssuer6;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_7")
    private String otherProviderIdentifier7;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_7")
    private String otherProviderIdentifierTypeCode7;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_7")
    private String otherProviderIdentifierState7;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_7")
    private String otherProviderIdentifierIssuer7;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_8")
    private String otherProviderIdentifier8;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_8")
    private String otherProviderIdentifierTypeCode8;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_8")
    private String otherProviderIdentifierState8;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_8")
    private String otherProviderIdentifierIssuer8;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_9")
    private String otherProviderIdentifier9;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_9")
    private String otherProviderIdentifierTypeCode9;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_9")
    private String otherProviderIdentifierState9;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_9")
    private String otherProviderIdentifierIssuer9;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_10")
    private String otherProviderIdentifier10;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_10")
    private String otherProviderIdentifierTypeCode10;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_10")
    private String otherProviderIdentifierState10;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_10")
    private String otherProviderIdentifierIssuer10;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_11")
    private String otherProviderIdentifier11;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_11")
    private String otherProviderIdentifierTypeCode11;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_11")
    private String otherProviderIdentifierState11;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_11")
    private String otherProviderIdentifierIssuer11;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_12")
    private String otherProviderIdentifier12;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_12")
    private String otherProviderIdentifierTypeCode12;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_12")
    private String otherProviderIdentifierState12;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_12")
    private String otherProviderIdentifierIssuer12;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_13")
    private String otherProviderIdentifier13;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_13")
    private String otherProviderIdentifierTypeCode13;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_13")
    private String otherProviderIdentifierState13;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_13")
    private String otherProviderIdentifierIssuer13;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_14")
    private String otherProviderIdentifier14;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_14")
    private String otherProviderIdentifierTypeCode14;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_14")
    private String otherProviderIdentifierState14;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_14")
    private String otherProviderIdentifierIssuer14;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_15")
    private String otherProviderIdentifier15;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_15")
    private String otherProviderIdentifierTypeCode15;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_15")
    private String otherProviderIdentifierState15;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_15")
    private String otherProviderIdentifierIssuer15;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_16")
    private String otherProviderIdentifier16;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_16")
    private String otherProviderIdentifierTypeCode16;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_16")
    private String otherProviderIdentifierState16;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_16")
    private String otherProviderIdentifierIssuer16;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_17")
    private String otherProviderIdentifier17;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_17")
    private String otherProviderIdentifierTypeCode17;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_17")
    private String otherProviderIdentifierState17;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_17")
    private String otherProviderIdentifierIssuer17;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_18")
    private String otherProviderIdentifier18;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_18")
    private String otherProviderIdentifierTypeCode18;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_18")
    private String otherProviderIdentifierState18;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_18")
    private String otherProviderIdentifierIssuer18;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_19")
    private String otherProviderIdentifier19;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_19")
    private String otherProviderIdentifierTypeCode19;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_19")
    private String otherProviderIdentifierState19;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_19")
    private String otherProviderIdentifierIssuer19;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_20")
    private String otherProviderIdentifier20;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_20")
    private String otherProviderIdentifierTypeCode20;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_20")
    private String otherProviderIdentifierState20;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_20")
    private String otherProviderIdentifierIssuer20;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_21")
    private String otherProviderIdentifier21;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_21")
    private String otherProviderIdentifierTypeCode21;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_21")
    private String otherProviderIdentifierState21;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_21")
    private String otherProviderIdentifierIssuer21;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_22")
    private String otherProviderIdentifier22;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_22")
    private String otherProviderIdentifierTypeCode22;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_22")
    private String otherProviderIdentifierState22;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_22")
    private String otherProviderIdentifierIssuer22;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_23")
    private String otherProviderIdentifier23;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_23")
    private String otherProviderIdentifierTypeCode23;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_23")
    private String otherProviderIdentifierState23;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_23")
    private String otherProviderIdentifierIssuer23;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_24")
    private String otherProviderIdentifier24;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_24")
    private String otherProviderIdentifierTypeCode24;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_24")
    private String otherProviderIdentifierState24;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_24")
    private String otherProviderIdentifierIssuer24;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_25")
    private String otherProviderIdentifier25;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_25")
    private String otherProviderIdentifierTypeCode25;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_25")
    private String otherProviderIdentifierState25;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_25")
    private String otherProviderIdentifierIssuer25;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_26")
    private String otherProviderIdentifier26;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_26")
    private String otherProviderIdentifierTypeCode26;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_26")
    private String otherProviderIdentifierState26;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_26")
    private String otherProviderIdentifierIssuer26;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_27")
    private String otherProviderIdentifier27;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_27")
    private String otherProviderIdentifierTypeCode27;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_27")
    private String otherProviderIdentifierState27;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_27")
    private String otherProviderIdentifierIssuer27;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_28")
    private String otherProviderIdentifier28;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_28")
    private String otherProviderIdentifierTypeCode28;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_28")
    private String otherProviderIdentifierState28;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_28")
    private String otherProviderIdentifierIssuer28;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_29")
    private String otherProviderIdentifier29;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_29")
    private String otherProviderIdentifierTypeCode29;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_29")
    private String otherProviderIdentifierState29;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_29")
    private String otherProviderIdentifierIssuer29;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_30")
    private String otherProviderIdentifier30;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_30")
    private String otherProviderIdentifierTypeCode30;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_30")
    private String otherProviderIdentifierState30;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_30")
    private String otherProviderIdentifierIssuer30;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_31")
    private String otherProviderIdentifier31;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_31")
    private String otherProviderIdentifierTypeCode31;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_31")
    private String otherProviderIdentifierState31;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_31")
    private String otherProviderIdentifierIssuer31;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_32")
    private String otherProviderIdentifier32;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_32")
    private String otherProviderIdentifierTypeCode32;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_32")
    private String otherProviderIdentifierState32;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_32")
    private String otherProviderIdentifierIssuer32;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_33")
    private String otherProviderIdentifier33;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_33")
    private String otherProviderIdentifierTypeCode33;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_33")
    private String otherProviderIdentifierState33;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_33")
    private String otherProviderIdentifierIssuer33;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_34")
    private String otherProviderIdentifier34;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_34")
    private String otherProviderIdentifierTypeCode34;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_34")
    private String otherProviderIdentifierState34;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_34")
    private String otherProviderIdentifierIssuer34;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_35")
    private String otherProviderIdentifier35;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_35")
    private String otherProviderIdentifierTypeCode35;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_35")
    private String otherProviderIdentifierState35;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_35")
    private String otherProviderIdentifierIssuer35;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_36")
    private String otherProviderIdentifier36;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_36")
    private String otherProviderIdentifierTypeCode36;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_36")
    private String otherProviderIdentifierState36;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_36")
    private String otherProviderIdentifierIssuer36;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_37")
    private String otherProviderIdentifier37;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_37")
    private String otherProviderIdentifierTypeCode37;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_37")
    private String otherProviderIdentifierState37;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_37")
    private String otherProviderIdentifierIssuer37;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_38")
    private String otherProviderIdentifier38;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_38")
    private String otherProviderIdentifierTypeCode38;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_38")
    private String otherProviderIdentifierState38;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_38")
    private String otherProviderIdentifierIssuer38;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_39")
    private String otherProviderIdentifier39;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_39")
    private String otherProviderIdentifierTypeCode39;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_39")
    private String otherProviderIdentifierState39;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_39")
    private String otherProviderIdentifierIssuer39;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_40")
    private String otherProviderIdentifier40;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_40")
    private String otherProviderIdentifierTypeCode40;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_40")
    private String otherProviderIdentifierState40;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_40")
    private String otherProviderIdentifierIssuer40;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_41")
    private String otherProviderIdentifier41;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_41")
    private String otherProviderIdentifierTypeCode41;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_41")
    private String otherProviderIdentifierState41;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_41")
    private String otherProviderIdentifierIssuer41;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_42")
    private String otherProviderIdentifier42;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_42")
    private String otherProviderIdentifierTypeCode42;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_42")
    private String otherProviderIdentifierState42;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_42")
    private String otherProviderIdentifierIssuer42;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_43")
    private String otherProviderIdentifier43;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_43")
    private String otherProviderIdentifierTypeCode43;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_43")
    private String otherProviderIdentifierState43;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_43")
    private String otherProviderIdentifierIssuer43;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_44")
    private String otherProviderIdentifier44;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_44")
    private String otherProviderIdentifierTypeCode44;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_44")
    private String otherProviderIdentifierState44;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_44")
    private String otherProviderIdentifierIssuer44;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_45")
    private String otherProviderIdentifier45;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_45")
    private String otherProviderIdentifierTypeCode45;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_45")
    private String otherProviderIdentifierState45;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_45")
    private String otherProviderIdentifierIssuer45;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_46")
    private String otherProviderIdentifier46;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_46")
    private String otherProviderIdentifierTypeCode46;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_46")
    private String otherProviderIdentifierState46;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_46")
    private String otherProviderIdentifierIssuer46;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_47")
    private String otherProviderIdentifier47;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_47")
    private String otherProviderIdentifierTypeCode47;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_47")
    private String otherProviderIdentifierState47;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_47")
    private String otherProviderIdentifierIssuer47;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_48")
    private String otherProviderIdentifier48;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_48")
    private String otherProviderIdentifierTypeCode48;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_48")
    private String otherProviderIdentifierState48;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_48")
    private String otherProviderIdentifierIssuer48;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_49")
    private String otherProviderIdentifier49;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_49")
    private String otherProviderIdentifierTypeCode49;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_49")
    private String otherProviderIdentifierState49;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_49")
    private String otherProviderIdentifierIssuer49;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_50")
    private String otherProviderIdentifier50;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Type_Code_50")
    private String otherProviderIdentifierTypeCode50;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_State_50")
    private String otherProviderIdentifierState50;

    @Size(max = 255)
    @Column(name = "Other_Provider_Identifier_Issuer_50")
    private String otherProviderIdentifierIssuer50;

    @Size(max = 255)
    @Column(name = "Is_Sole_Proprietor")
    private String isSoleProprietor;

    @Size(max = 255)
    @Column(name = "Is_Organization_Subpart")
    private String isOrganizationSubpart;

    @Size(max = 255)
    @Column(name = "Parent_Organization_LBN")
    private String parentOrganizationLBN;

    @Size(max = 255)
    @Column(name = "Parent_Organization_TIN")
    private String parentOrganizationTIN;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Name_Prefix_Text")
    private String authorizedOfficialNamePrefixText;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Name_Suffix_Text")
    private String authorizedOfficialNameSuffixText;

    @Size(max = 255)
    @Column(name = "Authorized_Official_Credential_Text")
    private String authorizedOfficialCredentialText;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_1")
    private String healthcareProviderTaxonomyGroup1;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_2")
    private String healthcareProviderTaxonomyGroup2;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_3")
    private String healthcareProviderTaxonomyGroup3;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_4")
    private String healthcareProviderTaxonomyGroup4;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_5")
    private String healthcareProviderTaxonomyGroup5;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_6")
    private String healthcareProviderTaxonomyGroup6;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_7")
    private String healthcareProviderTaxonomyGroup7;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_8")
    private String healthcareProviderTaxonomyGroup8;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_9")
    private String healthcareProviderTaxonomyGroup9;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_10")
    private String healthcareProviderTaxonomyGroup10;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_11")
    private String healthcareProviderTaxonomyGroup11;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_12")
    private String healthcareProviderTaxonomyGroup12;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_13")
    private String healthcareProviderTaxonomyGroup13;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_14")
    private String healthcareProviderTaxonomyGroup14;

    @Size(max = 255)
    @Column(name = "Healthcare_Provider_Taxonomy_Group_15")
    private String healthcareProviderTaxonomyGroup15;

    public Nppes() {
    }

    public Nppes(final String npi) {
        this.npi = npi;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(final String npi) {
        this.npi = npi;
    }

    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setEntityTypeCode(final String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public String getReplacementNPI() {
        return replacementNPI;
    }

    public void setReplacementNPI(final String replacementNPI) {
        this.replacementNPI = replacementNPI;
    }

    public String getEmployerIdentificationNumberEIN() {
        return employerIdentificationNumberEIN;
    }

    public void setEmployerIdentificationNumberEIN(final String employerIdentificationNumberEIN) {
        this.employerIdentificationNumberEIN = employerIdentificationNumberEIN;
    }

    public String getProviderOrganizationNameLegalBusinessName() {
        return providerOrganizationNameLegalBusinessName;
    }

    public void setProviderOrganizationNameLegalBusinessName(final String providerOrganizationNameLegalBusinessName) {
        this.providerOrganizationNameLegalBusinessName = providerOrganizationNameLegalBusinessName;
    }

    public String getProviderLastNameLegalName() {
        return providerLastNameLegalName;
    }

    public void setProviderLastNameLegalName(final String providerLastNameLegalName) {
        this.providerLastNameLegalName = providerLastNameLegalName;
    }

    public String getProviderFirstName() {
        return providerFirstName;
    }

    public void setProviderFirstName(final String providerFirstName) {
        this.providerFirstName = providerFirstName;
    }

    public String getProviderMiddleName() {
        return providerMiddleName;
    }

    public void setProviderMiddleName(final String providerMiddleName) {
        this.providerMiddleName = providerMiddleName;
    }

    public String getProviderNamePrefixText() {
        return providerNamePrefixText;
    }

    public void setProviderNamePrefixText(final String providerNamePrefixText) {
        this.providerNamePrefixText = providerNamePrefixText;
    }

    public String getProviderNameSuffixText() {
        return providerNameSuffixText;
    }

    public void setProviderNameSuffixText(final String providerNameSuffixText) {
        this.providerNameSuffixText = providerNameSuffixText;
    }

    public String getProviderCredentialText() {
        return providerCredentialText;
    }

    public void setProviderCredentialText(final String providerCredentialText) {
        this.providerCredentialText = providerCredentialText;
    }

    public String getProviderOtherOrganizationName() {
        return providerOtherOrganizationName;
    }

    public void setProviderOtherOrganizationName(final String providerOtherOrganizationName) {
        this.providerOtherOrganizationName = providerOtherOrganizationName;
    }

    public String getProviderOtherOrganizationNameTypeCode() {
        return providerOtherOrganizationNameTypeCode;
    }

    public void setProviderOtherOrganizationNameTypeCode(final String providerOtherOrganizationNameTypeCode) {
        this.providerOtherOrganizationNameTypeCode = providerOtherOrganizationNameTypeCode;
    }

    public String getProviderOtherLastName() {
        return providerOtherLastName;
    }

    public void setProviderOtherLastName(final String providerOtherLastName) {
        this.providerOtherLastName = providerOtherLastName;
    }

    public String getProviderOtherFirstName() {
        return providerOtherFirstName;
    }

    public void setProviderOtherFirstName(final String providerOtherFirstName) {
        this.providerOtherFirstName = providerOtherFirstName;
    }

    public String getProviderOtherMiddleName() {
        return providerOtherMiddleName;
    }

    public void setProviderOtherMiddleName(final String providerOtherMiddleName) {
        this.providerOtherMiddleName = providerOtherMiddleName;
    }

    public String getProviderOtherNamePrefixText() {
        return providerOtherNamePrefixText;
    }

    public void setProviderOtherNamePrefixText(final String providerOtherNamePrefixText) {
        this.providerOtherNamePrefixText = providerOtherNamePrefixText;
    }

    public String getProviderOtherNameSuffixText() {
        return providerOtherNameSuffixText;
    }

    public void setProviderOtherNameSuffixText(final String providerOtherNameSuffixText) {
        this.providerOtherNameSuffixText = providerOtherNameSuffixText;
    }

    public String getProviderOtherCredentialText() {
        return providerOtherCredentialText;
    }

    public void setProviderOtherCredentialText(final String providerOtherCredentialText) {
        this.providerOtherCredentialText = providerOtherCredentialText;
    }

    public String getProviderOtherLastNameTypeCode() {
        return providerOtherLastNameTypeCode;
    }

    public void setProviderOtherLastNameTypeCode(final String providerOtherLastNameTypeCode) {
        this.providerOtherLastNameTypeCode = providerOtherLastNameTypeCode;
    }

    public String getProviderFirstLineBusinessMailingAddress() {
        return providerFirstLineBusinessMailingAddress;
    }

    public void setProviderFirstLineBusinessMailingAddress(final String providerFirstLineBusinessMailingAddress) {
        this.providerFirstLineBusinessMailingAddress = providerFirstLineBusinessMailingAddress;
    }

    public String getProviderSecondLineBusinessMailingAddress() {
        return providerSecondLineBusinessMailingAddress;
    }

    public void setProviderSecondLineBusinessMailingAddress(final String providerSecondLineBusinessMailingAddress) {
        this.providerSecondLineBusinessMailingAddress = providerSecondLineBusinessMailingAddress;
    }

    public String getProviderBusinessMailingAddressCityName() {
        return providerBusinessMailingAddressCityName;
    }

    public void setProviderBusinessMailingAddressCityName(final String providerBusinessMailingAddressCityName) {
        this.providerBusinessMailingAddressCityName = providerBusinessMailingAddressCityName;
    }

    public String getProviderBusinessMailingAddressStateName() {
        return providerBusinessMailingAddressStateName;
    }

    public void setProviderBusinessMailingAddressStateName(final String providerBusinessMailingAddressStateName) {
        this.providerBusinessMailingAddressStateName = providerBusinessMailingAddressStateName;
    }

    public String getProviderBusinessMailingAddressPostalCode() {
        return providerBusinessMailingAddressPostalCode;
    }

    public void setProviderBusinessMailingAddressPostalCode(final String providerBusinessMailingAddressPostalCode) {
        this.providerBusinessMailingAddressPostalCode = providerBusinessMailingAddressPostalCode;
    }

    public String getProviderBusinessMailingAddressCountryCodeIfoutsideUS() {
        return providerBusinessMailingAddressCountryCodeIfoutsideUS;
    }

    public void setProviderBusinessMailingAddressCountryCodeIfoutsideUS(final String providerBusinessMailingAddressCountryCodeIfoutsideUS) {
        this.providerBusinessMailingAddressCountryCodeIfoutsideUS = providerBusinessMailingAddressCountryCodeIfoutsideUS;
    }

    public String getProviderBusinessMailingAddressTelephoneNumber() {
        return providerBusinessMailingAddressTelephoneNumber;
    }

    public void setProviderBusinessMailingAddressTelephoneNumber(final String providerBusinessMailingAddressTelephoneNumber) {
        this.providerBusinessMailingAddressTelephoneNumber = providerBusinessMailingAddressTelephoneNumber;
    }

    public String getProviderBusinessMailingAddressFaxNumber() {
        return providerBusinessMailingAddressFaxNumber;
    }

    public void setProviderBusinessMailingAddressFaxNumber(final String providerBusinessMailingAddressFaxNumber) {
        this.providerBusinessMailingAddressFaxNumber = providerBusinessMailingAddressFaxNumber;
    }

    public String getProviderFirstLineBusinessPracticeLocationAddress() {
        return providerFirstLineBusinessPracticeLocationAddress;
    }

    public void setProviderFirstLineBusinessPracticeLocationAddress(final String providerFirstLineBusinessPracticeLocationAddress) {
        this.providerFirstLineBusinessPracticeLocationAddress = providerFirstLineBusinessPracticeLocationAddress;
    }

    public String getProviderSecondLineBusinessPracticeLocationAddress() {
        return providerSecondLineBusinessPracticeLocationAddress;
    }

    public void setProviderSecondLineBusinessPracticeLocationAddress(final String providerSecondLineBusinessPracticeLocationAddress) {
        this.providerSecondLineBusinessPracticeLocationAddress = providerSecondLineBusinessPracticeLocationAddress;
    }

    public String getProviderBusinessPracticeLocationAddressCityName() {
        return providerBusinessPracticeLocationAddressCityName;
    }

    public void setProviderBusinessPracticeLocationAddressCityName(final String providerBusinessPracticeLocationAddressCityName) {
        this.providerBusinessPracticeLocationAddressCityName = providerBusinessPracticeLocationAddressCityName;
    }

    public String getProviderBusinessPracticeLocationAddressStateName() {
        return providerBusinessPracticeLocationAddressStateName;
    }

    public void setProviderBusinessPracticeLocationAddressStateName(final String providerBusinessPracticeLocationAddressStateName) {
        this.providerBusinessPracticeLocationAddressStateName = providerBusinessPracticeLocationAddressStateName;
    }

    public String getProviderBusinessPracticeLocationAddressPostalCode() {
        return providerBusinessPracticeLocationAddressPostalCode;
    }

    public void setProviderBusinessPracticeLocationAddressPostalCode(final String providerBusinessPracticeLocationAddressPostalCode) {
        this.providerBusinessPracticeLocationAddressPostalCode = providerBusinessPracticeLocationAddressPostalCode;
    }

    public String getProviderBusinessPracticeLocationAddressCountryCodeIfou() {
        return providerBusinessPracticeLocationAddressCountryCodeIfou;
    }

    public void setProviderBusinessPracticeLocationAddressCountryCodeIfou(final String providerBusinessPracticeLocationAddressCountryCodeIfou) {
        this.providerBusinessPracticeLocationAddressCountryCodeIfou = providerBusinessPracticeLocationAddressCountryCodeIfou;
    }

    public String getProviderBusinessPracticeLocationAddressTelephoneNumber() {
        return providerBusinessPracticeLocationAddressTelephoneNumber;
    }

    public void setProviderBusinessPracticeLocationAddressTelephoneNumber(final String providerBusinessPracticeLocationAddressTelephoneNumber) {
        this.providerBusinessPracticeLocationAddressTelephoneNumber = providerBusinessPracticeLocationAddressTelephoneNumber;
    }

    public String getProviderBusinessPracticeLocationAddressFaxNumber() {
        return providerBusinessPracticeLocationAddressFaxNumber;
    }

    public void setProviderBusinessPracticeLocationAddressFaxNumber(final String providerBusinessPracticeLocationAddressFaxNumber) {
        this.providerBusinessPracticeLocationAddressFaxNumber = providerBusinessPracticeLocationAddressFaxNumber;
    }

    public String getProviderEnumerationDate() {
        return providerEnumerationDate;
    }

    public void setProviderEnumerationDate(final String providerEnumerationDate) {
        this.providerEnumerationDate = providerEnumerationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(final String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getNPIDeactivationReasonCode() {
        return nPIDeactivationReasonCode;
    }

    public void setNPIDeactivationReasonCode(final String nPIDeactivationReasonCode) {
        this.nPIDeactivationReasonCode = nPIDeactivationReasonCode;
    }

    public String getNPIDeactivationDate() {
        return nPIDeactivationDate;
    }

    public void setNPIDeactivationDate(final String nPIDeactivationDate) {
        this.nPIDeactivationDate = nPIDeactivationDate;
    }

    public String getNPIReactivationDate() {
        return nPIReactivationDate;
    }

    public void setNPIReactivationDate(final String nPIReactivationDate) {
        this.nPIReactivationDate = nPIReactivationDate;
    }

    public String getProviderGenderCode() {
        return providerGenderCode;
    }

    public void setProviderGenderCode(final String providerGenderCode) {
        this.providerGenderCode = providerGenderCode;
    }

    public String getAuthorizedOfficialLastName() {
        return authorizedOfficialLastName;
    }

    public void setAuthorizedOfficialLastName(final String authorizedOfficialLastName) {
        this.authorizedOfficialLastName = authorizedOfficialLastName;
    }

    public String getAuthorizedOfficialFirstName() {
        return authorizedOfficialFirstName;
    }

    public void setAuthorizedOfficialFirstName(final String authorizedOfficialFirstName) {
        this.authorizedOfficialFirstName = authorizedOfficialFirstName;
    }

    public String getAuthorizedOfficialMiddleName() {
        return authorizedOfficialMiddleName;
    }

    public void setAuthorizedOfficialMiddleName(final String authorizedOfficialMiddleName) {
        this.authorizedOfficialMiddleName = authorizedOfficialMiddleName;
    }

    public String getAuthorizedOfficialTitleorPosition() {
        return authorizedOfficialTitleorPosition;
    }

    public void setAuthorizedOfficialTitleorPosition(final String authorizedOfficialTitleorPosition) {
        this.authorizedOfficialTitleorPosition = authorizedOfficialTitleorPosition;
    }

    public String getAuthorizedOfficialTelephoneNumber() {
        return authorizedOfficialTelephoneNumber;
    }

    public void setAuthorizedOfficialTelephoneNumber(final String authorizedOfficialTelephoneNumber) {
        this.authorizedOfficialTelephoneNumber = authorizedOfficialTelephoneNumber;
    }

    public String getHealthcareProviderTaxonomyCode1() {
        return healthcareProviderTaxonomyCode1;
    }

    public void setHealthcareProviderTaxonomyCode1(final String healthcareProviderTaxonomyCode1) {
        this.healthcareProviderTaxonomyCode1 = healthcareProviderTaxonomyCode1;
    }

    public String getProviderLicenseNumber1() {
        return providerLicenseNumber1;
    }

    public void setProviderLicenseNumber1(final String providerLicenseNumber1) {
        this.providerLicenseNumber1 = providerLicenseNumber1;
    }

    public String getProviderLicenseNumberStateCode1() {
        return providerLicenseNumberStateCode1;
    }

    public void setProviderLicenseNumberStateCode1(final String providerLicenseNumberStateCode1) {
        this.providerLicenseNumberStateCode1 = providerLicenseNumberStateCode1;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch1() {
        return healthcareProviderPrimaryTaxonomySwitch1;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch1(final String healthcareProviderPrimaryTaxonomySwitch1) {
        this.healthcareProviderPrimaryTaxonomySwitch1 = healthcareProviderPrimaryTaxonomySwitch1;
    }

    public String getHealthcareProviderTaxonomyCode2() {
        return healthcareProviderTaxonomyCode2;
    }

    public void setHealthcareProviderTaxonomyCode2(final String healthcareProviderTaxonomyCode2) {
        this.healthcareProviderTaxonomyCode2 = healthcareProviderTaxonomyCode2;
    }

    public String getProviderLicenseNumber2() {
        return providerLicenseNumber2;
    }

    public void setProviderLicenseNumber2(final String providerLicenseNumber2) {
        this.providerLicenseNumber2 = providerLicenseNumber2;
    }

    public String getProviderLicenseNumberStateCode2() {
        return providerLicenseNumberStateCode2;
    }

    public void setProviderLicenseNumberStateCode2(final String providerLicenseNumberStateCode2) {
        this.providerLicenseNumberStateCode2 = providerLicenseNumberStateCode2;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch2() {
        return healthcareProviderPrimaryTaxonomySwitch2;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch2(final String healthcareProviderPrimaryTaxonomySwitch2) {
        this.healthcareProviderPrimaryTaxonomySwitch2 = healthcareProviderPrimaryTaxonomySwitch2;
    }

    public String getHealthcareProviderTaxonomyCode3() {
        return healthcareProviderTaxonomyCode3;
    }

    public void setHealthcareProviderTaxonomyCode3(final String healthcareProviderTaxonomyCode3) {
        this.healthcareProviderTaxonomyCode3 = healthcareProviderTaxonomyCode3;
    }

    public String getProviderLicenseNumber3() {
        return providerLicenseNumber3;
    }

    public void setProviderLicenseNumber3(final String providerLicenseNumber3) {
        this.providerLicenseNumber3 = providerLicenseNumber3;
    }

    public String getProviderLicenseNumberStateCode3() {
        return providerLicenseNumberStateCode3;
    }

    public void setProviderLicenseNumberStateCode3(final String providerLicenseNumberStateCode3) {
        this.providerLicenseNumberStateCode3 = providerLicenseNumberStateCode3;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch3() {
        return healthcareProviderPrimaryTaxonomySwitch3;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch3(final String healthcareProviderPrimaryTaxonomySwitch3) {
        this.healthcareProviderPrimaryTaxonomySwitch3 = healthcareProviderPrimaryTaxonomySwitch3;
    }

    public String getHealthcareProviderTaxonomyCode4() {
        return healthcareProviderTaxonomyCode4;
    }

    public void setHealthcareProviderTaxonomyCode4(final String healthcareProviderTaxonomyCode4) {
        this.healthcareProviderTaxonomyCode4 = healthcareProviderTaxonomyCode4;
    }

    public String getProviderLicenseNumber4() {
        return providerLicenseNumber4;
    }

    public void setProviderLicenseNumber4(final String providerLicenseNumber4) {
        this.providerLicenseNumber4 = providerLicenseNumber4;
    }

    public String getProviderLicenseNumberStateCode4() {
        return providerLicenseNumberStateCode4;
    }

    public void setProviderLicenseNumberStateCode4(final String providerLicenseNumberStateCode4) {
        this.providerLicenseNumberStateCode4 = providerLicenseNumberStateCode4;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch4() {
        return healthcareProviderPrimaryTaxonomySwitch4;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch4(final String healthcareProviderPrimaryTaxonomySwitch4) {
        this.healthcareProviderPrimaryTaxonomySwitch4 = healthcareProviderPrimaryTaxonomySwitch4;
    }

    public String getHealthcareProviderTaxonomyCode5() {
        return healthcareProviderTaxonomyCode5;
    }

    public void setHealthcareProviderTaxonomyCode5(final String healthcareProviderTaxonomyCode5) {
        this.healthcareProviderTaxonomyCode5 = healthcareProviderTaxonomyCode5;
    }

    public String getProviderLicenseNumber5() {
        return providerLicenseNumber5;
    }

    public void setProviderLicenseNumber5(final String providerLicenseNumber5) {
        this.providerLicenseNumber5 = providerLicenseNumber5;
    }

    public String getProviderLicenseNumberStateCode5() {
        return providerLicenseNumberStateCode5;
    }

    public void setProviderLicenseNumberStateCode5(final String providerLicenseNumberStateCode5) {
        this.providerLicenseNumberStateCode5 = providerLicenseNumberStateCode5;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch5() {
        return healthcareProviderPrimaryTaxonomySwitch5;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch5(final String healthcareProviderPrimaryTaxonomySwitch5) {
        this.healthcareProviderPrimaryTaxonomySwitch5 = healthcareProviderPrimaryTaxonomySwitch5;
    }

    public String getHealthcareProviderTaxonomyCode6() {
        return healthcareProviderTaxonomyCode6;
    }

    public void setHealthcareProviderTaxonomyCode6(final String healthcareProviderTaxonomyCode6) {
        this.healthcareProviderTaxonomyCode6 = healthcareProviderTaxonomyCode6;
    }

    public String getProviderLicenseNumber6() {
        return providerLicenseNumber6;
    }

    public void setProviderLicenseNumber6(final String providerLicenseNumber6) {
        this.providerLicenseNumber6 = providerLicenseNumber6;
    }

    public String getProviderLicenseNumberStateCode6() {
        return providerLicenseNumberStateCode6;
    }

    public void setProviderLicenseNumberStateCode6(final String providerLicenseNumberStateCode6) {
        this.providerLicenseNumberStateCode6 = providerLicenseNumberStateCode6;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch6() {
        return healthcareProviderPrimaryTaxonomySwitch6;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch6(final String healthcareProviderPrimaryTaxonomySwitch6) {
        this.healthcareProviderPrimaryTaxonomySwitch6 = healthcareProviderPrimaryTaxonomySwitch6;
    }

    public String getHealthcareProviderTaxonomyCode7() {
        return healthcareProviderTaxonomyCode7;
    }

    public void setHealthcareProviderTaxonomyCode7(final String healthcareProviderTaxonomyCode7) {
        this.healthcareProviderTaxonomyCode7 = healthcareProviderTaxonomyCode7;
    }

    public String getProviderLicenseNumber7() {
        return providerLicenseNumber7;
    }

    public void setProviderLicenseNumber7(final String providerLicenseNumber7) {
        this.providerLicenseNumber7 = providerLicenseNumber7;
    }

    public String getProviderLicenseNumberStateCode7() {
        return providerLicenseNumberStateCode7;
    }

    public void setProviderLicenseNumberStateCode7(final String providerLicenseNumberStateCode7) {
        this.providerLicenseNumberStateCode7 = providerLicenseNumberStateCode7;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch7() {
        return healthcareProviderPrimaryTaxonomySwitch7;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch7(final String healthcareProviderPrimaryTaxonomySwitch7) {
        this.healthcareProviderPrimaryTaxonomySwitch7 = healthcareProviderPrimaryTaxonomySwitch7;
    }

    public String getHealthcareProviderTaxonomyCode8() {
        return healthcareProviderTaxonomyCode8;
    }

    public void setHealthcareProviderTaxonomyCode8(final String healthcareProviderTaxonomyCode8) {
        this.healthcareProviderTaxonomyCode8 = healthcareProviderTaxonomyCode8;
    }

    public String getProviderLicenseNumber8() {
        return providerLicenseNumber8;
    }

    public void setProviderLicenseNumber8(final String providerLicenseNumber8) {
        this.providerLicenseNumber8 = providerLicenseNumber8;
    }

    public String getProviderLicenseNumberStateCode8() {
        return providerLicenseNumberStateCode8;
    }

    public void setProviderLicenseNumberStateCode8(final String providerLicenseNumberStateCode8) {
        this.providerLicenseNumberStateCode8 = providerLicenseNumberStateCode8;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch8() {
        return healthcareProviderPrimaryTaxonomySwitch8;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch8(final String healthcareProviderPrimaryTaxonomySwitch8) {
        this.healthcareProviderPrimaryTaxonomySwitch8 = healthcareProviderPrimaryTaxonomySwitch8;
    }

    public String getHealthcareProviderTaxonomyCode9() {
        return healthcareProviderTaxonomyCode9;
    }

    public void setHealthcareProviderTaxonomyCode9(final String healthcareProviderTaxonomyCode9) {
        this.healthcareProviderTaxonomyCode9 = healthcareProviderTaxonomyCode9;
    }

    public String getProviderLicenseNumber9() {
        return providerLicenseNumber9;
    }

    public void setProviderLicenseNumber9(final String providerLicenseNumber9) {
        this.providerLicenseNumber9 = providerLicenseNumber9;
    }

    public String getProviderLicenseNumberStateCode9() {
        return providerLicenseNumberStateCode9;
    }

    public void setProviderLicenseNumberStateCode9(final String providerLicenseNumberStateCode9) {
        this.providerLicenseNumberStateCode9 = providerLicenseNumberStateCode9;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch9() {
        return healthcareProviderPrimaryTaxonomySwitch9;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch9(final String healthcareProviderPrimaryTaxonomySwitch9) {
        this.healthcareProviderPrimaryTaxonomySwitch9 = healthcareProviderPrimaryTaxonomySwitch9;
    }

    public String getHealthcareProviderTaxonomyCode10() {
        return healthcareProviderTaxonomyCode10;
    }

    public void setHealthcareProviderTaxonomyCode10(final String healthcareProviderTaxonomyCode10) {
        this.healthcareProviderTaxonomyCode10 = healthcareProviderTaxonomyCode10;
    }

    public String getProviderLicenseNumber10() {
        return providerLicenseNumber10;
    }

    public void setProviderLicenseNumber10(final String providerLicenseNumber10) {
        this.providerLicenseNumber10 = providerLicenseNumber10;
    }

    public String getProviderLicenseNumberStateCode10() {
        return providerLicenseNumberStateCode10;
    }

    public void setProviderLicenseNumberStateCode10(final String providerLicenseNumberStateCode10) {
        this.providerLicenseNumberStateCode10 = providerLicenseNumberStateCode10;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch10() {
        return healthcareProviderPrimaryTaxonomySwitch10;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch10(final String healthcareProviderPrimaryTaxonomySwitch10) {
        this.healthcareProviderPrimaryTaxonomySwitch10 = healthcareProviderPrimaryTaxonomySwitch10;
    }

    public String getHealthcareProviderTaxonomyCode11() {
        return healthcareProviderTaxonomyCode11;
    }

    public void setHealthcareProviderTaxonomyCode11(final String healthcareProviderTaxonomyCode11) {
        this.healthcareProviderTaxonomyCode11 = healthcareProviderTaxonomyCode11;
    }

    public String getProviderLicenseNumber11() {
        return providerLicenseNumber11;
    }

    public void setProviderLicenseNumber11(final String providerLicenseNumber11) {
        this.providerLicenseNumber11 = providerLicenseNumber11;
    }

    public String getProviderLicenseNumberStateCode11() {
        return providerLicenseNumberStateCode11;
    }

    public void setProviderLicenseNumberStateCode11(final String providerLicenseNumberStateCode11) {
        this.providerLicenseNumberStateCode11 = providerLicenseNumberStateCode11;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch11() {
        return healthcareProviderPrimaryTaxonomySwitch11;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch11(final String healthcareProviderPrimaryTaxonomySwitch11) {
        this.healthcareProviderPrimaryTaxonomySwitch11 = healthcareProviderPrimaryTaxonomySwitch11;
    }

    public String getHealthcareProviderTaxonomyCode12() {
        return healthcareProviderTaxonomyCode12;
    }

    public void setHealthcareProviderTaxonomyCode12(final String healthcareProviderTaxonomyCode12) {
        this.healthcareProviderTaxonomyCode12 = healthcareProviderTaxonomyCode12;
    }

    public String getProviderLicenseNumber12() {
        return providerLicenseNumber12;
    }

    public void setProviderLicenseNumber12(final String providerLicenseNumber12) {
        this.providerLicenseNumber12 = providerLicenseNumber12;
    }

    public String getProviderLicenseNumberStateCode12() {
        return providerLicenseNumberStateCode12;
    }

    public void setProviderLicenseNumberStateCode12(final String providerLicenseNumberStateCode12) {
        this.providerLicenseNumberStateCode12 = providerLicenseNumberStateCode12;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch12() {
        return healthcareProviderPrimaryTaxonomySwitch12;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch12(final String healthcareProviderPrimaryTaxonomySwitch12) {
        this.healthcareProviderPrimaryTaxonomySwitch12 = healthcareProviderPrimaryTaxonomySwitch12;
    }

    public String getHealthcareProviderTaxonomyCode13() {
        return healthcareProviderTaxonomyCode13;
    }

    public void setHealthcareProviderTaxonomyCode13(final String healthcareProviderTaxonomyCode13) {
        this.healthcareProviderTaxonomyCode13 = healthcareProviderTaxonomyCode13;
    }

    public String getProviderLicenseNumber13() {
        return providerLicenseNumber13;
    }

    public void setProviderLicenseNumber13(final String providerLicenseNumber13) {
        this.providerLicenseNumber13 = providerLicenseNumber13;
    }

    public String getProviderLicenseNumberStateCode13() {
        return providerLicenseNumberStateCode13;
    }

    public void setProviderLicenseNumberStateCode13(final String providerLicenseNumberStateCode13) {
        this.providerLicenseNumberStateCode13 = providerLicenseNumberStateCode13;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch13() {
        return healthcareProviderPrimaryTaxonomySwitch13;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch13(final String healthcareProviderPrimaryTaxonomySwitch13) {
        this.healthcareProviderPrimaryTaxonomySwitch13 = healthcareProviderPrimaryTaxonomySwitch13;
    }

    public String getHealthcareProviderTaxonomyCode14() {
        return healthcareProviderTaxonomyCode14;
    }

    public void setHealthcareProviderTaxonomyCode14(final String healthcareProviderTaxonomyCode14) {
        this.healthcareProviderTaxonomyCode14 = healthcareProviderTaxonomyCode14;
    }

    public String getProviderLicenseNumber14() {
        return providerLicenseNumber14;
    }

    public void setProviderLicenseNumber14(final String providerLicenseNumber14) {
        this.providerLicenseNumber14 = providerLicenseNumber14;
    }

    public String getProviderLicenseNumberStateCode14() {
        return providerLicenseNumberStateCode14;
    }

    public void setProviderLicenseNumberStateCode14(final String providerLicenseNumberStateCode14) {
        this.providerLicenseNumberStateCode14 = providerLicenseNumberStateCode14;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch14() {
        return healthcareProviderPrimaryTaxonomySwitch14;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch14(final String healthcareProviderPrimaryTaxonomySwitch14) {
        this.healthcareProviderPrimaryTaxonomySwitch14 = healthcareProviderPrimaryTaxonomySwitch14;
    }

    public String getHealthcareProviderTaxonomyCode15() {
        return healthcareProviderTaxonomyCode15;
    }

    public void setHealthcareProviderTaxonomyCode15(final String healthcareProviderTaxonomyCode15) {
        this.healthcareProviderTaxonomyCode15 = healthcareProviderTaxonomyCode15;
    }

    public String getProviderLicenseNumber15() {
        return providerLicenseNumber15;
    }

    public void setProviderLicenseNumber15(final String providerLicenseNumber15) {
        this.providerLicenseNumber15 = providerLicenseNumber15;
    }

    public String getProviderLicenseNumberStateCode15() {
        return providerLicenseNumberStateCode15;
    }

    public void setProviderLicenseNumberStateCode15(final String providerLicenseNumberStateCode15) {
        this.providerLicenseNumberStateCode15 = providerLicenseNumberStateCode15;
    }

    public String getHealthcareProviderPrimaryTaxonomySwitch15() {
        return healthcareProviderPrimaryTaxonomySwitch15;
    }

    public void setHealthcareProviderPrimaryTaxonomySwitch15(final String healthcareProviderPrimaryTaxonomySwitch15) {
        this.healthcareProviderPrimaryTaxonomySwitch15 = healthcareProviderPrimaryTaxonomySwitch15;
    }

    public String getOtherProviderIdentifier1() {
        return otherProviderIdentifier1;
    }

    public void setOtherProviderIdentifier1(final String otherProviderIdentifier1) {
        this.otherProviderIdentifier1 = otherProviderIdentifier1;
    }

    public String getOtherProviderIdentifierTypeCode1() {
        return otherProviderIdentifierTypeCode1;
    }

    public void setOtherProviderIdentifierTypeCode1(final String otherProviderIdentifierTypeCode1) {
        this.otherProviderIdentifierTypeCode1 = otherProviderIdentifierTypeCode1;
    }

    public String getOtherProviderIdentifierState1() {
        return otherProviderIdentifierState1;
    }

    public void setOtherProviderIdentifierState1(final String otherProviderIdentifierState1) {
        this.otherProviderIdentifierState1 = otherProviderIdentifierState1;
    }

    public String getOtherProviderIdentifierIssuer1() {
        return otherProviderIdentifierIssuer1;
    }

    public void setOtherProviderIdentifierIssuer1(final String otherProviderIdentifierIssuer1) {
        this.otherProviderIdentifierIssuer1 = otherProviderIdentifierIssuer1;
    }

    public String getOtherProviderIdentifier2() {
        return otherProviderIdentifier2;
    }

    public void setOtherProviderIdentifier2(final String otherProviderIdentifier2) {
        this.otherProviderIdentifier2 = otherProviderIdentifier2;
    }

    public String getOtherProviderIdentifierTypeCode2() {
        return otherProviderIdentifierTypeCode2;
    }

    public void setOtherProviderIdentifierTypeCode2(final String otherProviderIdentifierTypeCode2) {
        this.otherProviderIdentifierTypeCode2 = otherProviderIdentifierTypeCode2;
    }

    public String getOtherProviderIdentifierState2() {
        return otherProviderIdentifierState2;
    }

    public void setOtherProviderIdentifierState2(final String otherProviderIdentifierState2) {
        this.otherProviderIdentifierState2 = otherProviderIdentifierState2;
    }

    public String getOtherProviderIdentifierIssuer2() {
        return otherProviderIdentifierIssuer2;
    }

    public void setOtherProviderIdentifierIssuer2(final String otherProviderIdentifierIssuer2) {
        this.otherProviderIdentifierIssuer2 = otherProviderIdentifierIssuer2;
    }

    public String getOtherProviderIdentifier3() {
        return otherProviderIdentifier3;
    }

    public void setOtherProviderIdentifier3(final String otherProviderIdentifier3) {
        this.otherProviderIdentifier3 = otherProviderIdentifier3;
    }

    public String getOtherProviderIdentifierTypeCode3() {
        return otherProviderIdentifierTypeCode3;
    }

    public void setOtherProviderIdentifierTypeCode3(final String otherProviderIdentifierTypeCode3) {
        this.otherProviderIdentifierTypeCode3 = otherProviderIdentifierTypeCode3;
    }

    public String getOtherProviderIdentifierState3() {
        return otherProviderIdentifierState3;
    }

    public void setOtherProviderIdentifierState3(final String otherProviderIdentifierState3) {
        this.otherProviderIdentifierState3 = otherProviderIdentifierState3;
    }

    public String getOtherProviderIdentifierIssuer3() {
        return otherProviderIdentifierIssuer3;
    }

    public void setOtherProviderIdentifierIssuer3(final String otherProviderIdentifierIssuer3) {
        this.otherProviderIdentifierIssuer3 = otherProviderIdentifierIssuer3;
    }

    public String getOtherProviderIdentifier4() {
        return otherProviderIdentifier4;
    }

    public void setOtherProviderIdentifier4(final String otherProviderIdentifier4) {
        this.otherProviderIdentifier4 = otherProviderIdentifier4;
    }

    public String getOtherProviderIdentifierTypeCode4() {
        return otherProviderIdentifierTypeCode4;
    }

    public void setOtherProviderIdentifierTypeCode4(final String otherProviderIdentifierTypeCode4) {
        this.otherProviderIdentifierTypeCode4 = otherProviderIdentifierTypeCode4;
    }

    public String getOtherProviderIdentifierState4() {
        return otherProviderIdentifierState4;
    }

    public void setOtherProviderIdentifierState4(final String otherProviderIdentifierState4) {
        this.otherProviderIdentifierState4 = otherProviderIdentifierState4;
    }

    public String getOtherProviderIdentifierIssuer4() {
        return otherProviderIdentifierIssuer4;
    }

    public void setOtherProviderIdentifierIssuer4(final String otherProviderIdentifierIssuer4) {
        this.otherProviderIdentifierIssuer4 = otherProviderIdentifierIssuer4;
    }

    public String getOtherProviderIdentifier5() {
        return otherProviderIdentifier5;
    }

    public void setOtherProviderIdentifier5(final String otherProviderIdentifier5) {
        this.otherProviderIdentifier5 = otherProviderIdentifier5;
    }

    public String getOtherProviderIdentifierTypeCode5() {
        return otherProviderIdentifierTypeCode5;
    }

    public void setOtherProviderIdentifierTypeCode5(final String otherProviderIdentifierTypeCode5) {
        this.otherProviderIdentifierTypeCode5 = otherProviderIdentifierTypeCode5;
    }

    public String getOtherProviderIdentifierState5() {
        return otherProviderIdentifierState5;
    }

    public void setOtherProviderIdentifierState5(final String otherProviderIdentifierState5) {
        this.otherProviderIdentifierState5 = otherProviderIdentifierState5;
    }

    public String getOtherProviderIdentifierIssuer5() {
        return otherProviderIdentifierIssuer5;
    }

    public void setOtherProviderIdentifierIssuer5(final String otherProviderIdentifierIssuer5) {
        this.otherProviderIdentifierIssuer5 = otherProviderIdentifierIssuer5;
    }

    public String getOtherProviderIdentifier6() {
        return otherProviderIdentifier6;
    }

    public void setOtherProviderIdentifier6(final String otherProviderIdentifier6) {
        this.otherProviderIdentifier6 = otherProviderIdentifier6;
    }

    public String getOtherProviderIdentifierTypeCode6() {
        return otherProviderIdentifierTypeCode6;
    }

    public void setOtherProviderIdentifierTypeCode6(final String otherProviderIdentifierTypeCode6) {
        this.otherProviderIdentifierTypeCode6 = otherProviderIdentifierTypeCode6;
    }

    public String getOtherProviderIdentifierState6() {
        return otherProviderIdentifierState6;
    }

    public void setOtherProviderIdentifierState6(final String otherProviderIdentifierState6) {
        this.otherProviderIdentifierState6 = otherProviderIdentifierState6;
    }

    public String getOtherProviderIdentifierIssuer6() {
        return otherProviderIdentifierIssuer6;
    }

    public void setOtherProviderIdentifierIssuer6(final String otherProviderIdentifierIssuer6) {
        this.otherProviderIdentifierIssuer6 = otherProviderIdentifierIssuer6;
    }

    public String getOtherProviderIdentifier7() {
        return otherProviderIdentifier7;
    }

    public void setOtherProviderIdentifier7(final String otherProviderIdentifier7) {
        this.otherProviderIdentifier7 = otherProviderIdentifier7;
    }

    public String getOtherProviderIdentifierTypeCode7() {
        return otherProviderIdentifierTypeCode7;
    }

    public void setOtherProviderIdentifierTypeCode7(final String otherProviderIdentifierTypeCode7) {
        this.otherProviderIdentifierTypeCode7 = otherProviderIdentifierTypeCode7;
    }

    public String getOtherProviderIdentifierState7() {
        return otherProviderIdentifierState7;
    }

    public void setOtherProviderIdentifierState7(final String otherProviderIdentifierState7) {
        this.otherProviderIdentifierState7 = otherProviderIdentifierState7;
    }

    public String getOtherProviderIdentifierIssuer7() {
        return otherProviderIdentifierIssuer7;
    }

    public void setOtherProviderIdentifierIssuer7(final String otherProviderIdentifierIssuer7) {
        this.otherProviderIdentifierIssuer7 = otherProviderIdentifierIssuer7;
    }

    public String getOtherProviderIdentifier8() {
        return otherProviderIdentifier8;
    }

    public void setOtherProviderIdentifier8(final String otherProviderIdentifier8) {
        this.otherProviderIdentifier8 = otherProviderIdentifier8;
    }

    public String getOtherProviderIdentifierTypeCode8() {
        return otherProviderIdentifierTypeCode8;
    }

    public void setOtherProviderIdentifierTypeCode8(final String otherProviderIdentifierTypeCode8) {
        this.otherProviderIdentifierTypeCode8 = otherProviderIdentifierTypeCode8;
    }

    public String getOtherProviderIdentifierState8() {
        return otherProviderIdentifierState8;
    }

    public void setOtherProviderIdentifierState8(final String otherProviderIdentifierState8) {
        this.otherProviderIdentifierState8 = otherProviderIdentifierState8;
    }

    public String getOtherProviderIdentifierIssuer8() {
        return otherProviderIdentifierIssuer8;
    }

    public void setOtherProviderIdentifierIssuer8(final String otherProviderIdentifierIssuer8) {
        this.otherProviderIdentifierIssuer8 = otherProviderIdentifierIssuer8;
    }

    public String getOtherProviderIdentifier9() {
        return otherProviderIdentifier9;
    }

    public void setOtherProviderIdentifier9(final String otherProviderIdentifier9) {
        this.otherProviderIdentifier9 = otherProviderIdentifier9;
    }

    public String getOtherProviderIdentifierTypeCode9() {
        return otherProviderIdentifierTypeCode9;
    }

    public void setOtherProviderIdentifierTypeCode9(final String otherProviderIdentifierTypeCode9) {
        this.otherProviderIdentifierTypeCode9 = otherProviderIdentifierTypeCode9;
    }

    public String getOtherProviderIdentifierState9() {
        return otherProviderIdentifierState9;
    }

    public void setOtherProviderIdentifierState9(final String otherProviderIdentifierState9) {
        this.otherProviderIdentifierState9 = otherProviderIdentifierState9;
    }

    public String getOtherProviderIdentifierIssuer9() {
        return otherProviderIdentifierIssuer9;
    }

    public void setOtherProviderIdentifierIssuer9(final String otherProviderIdentifierIssuer9) {
        this.otherProviderIdentifierIssuer9 = otherProviderIdentifierIssuer9;
    }

    public String getOtherProviderIdentifier10() {
        return otherProviderIdentifier10;
    }

    public void setOtherProviderIdentifier10(final String otherProviderIdentifier10) {
        this.otherProviderIdentifier10 = otherProviderIdentifier10;
    }

    public String getOtherProviderIdentifierTypeCode10() {
        return otherProviderIdentifierTypeCode10;
    }

    public void setOtherProviderIdentifierTypeCode10(final String otherProviderIdentifierTypeCode10) {
        this.otherProviderIdentifierTypeCode10 = otherProviderIdentifierTypeCode10;
    }

    public String getOtherProviderIdentifierState10() {
        return otherProviderIdentifierState10;
    }

    public void setOtherProviderIdentifierState10(final String otherProviderIdentifierState10) {
        this.otherProviderIdentifierState10 = otherProviderIdentifierState10;
    }

    public String getOtherProviderIdentifierIssuer10() {
        return otherProviderIdentifierIssuer10;
    }

    public void setOtherProviderIdentifierIssuer10(final String otherProviderIdentifierIssuer10) {
        this.otherProviderIdentifierIssuer10 = otherProviderIdentifierIssuer10;
    }

    public String getOtherProviderIdentifier11() {
        return otherProviderIdentifier11;
    }

    public void setOtherProviderIdentifier11(final String otherProviderIdentifier11) {
        this.otherProviderIdentifier11 = otherProviderIdentifier11;
    }

    public String getOtherProviderIdentifierTypeCode11() {
        return otherProviderIdentifierTypeCode11;
    }

    public void setOtherProviderIdentifierTypeCode11(final String otherProviderIdentifierTypeCode11) {
        this.otherProviderIdentifierTypeCode11 = otherProviderIdentifierTypeCode11;
    }

    public String getOtherProviderIdentifierState11() {
        return otherProviderIdentifierState11;
    }

    public void setOtherProviderIdentifierState11(final String otherProviderIdentifierState11) {
        this.otherProviderIdentifierState11 = otherProviderIdentifierState11;
    }

    public String getOtherProviderIdentifierIssuer11() {
        return otherProviderIdentifierIssuer11;
    }

    public void setOtherProviderIdentifierIssuer11(final String otherProviderIdentifierIssuer11) {
        this.otherProviderIdentifierIssuer11 = otherProviderIdentifierIssuer11;
    }

    public String getOtherProviderIdentifier12() {
        return otherProviderIdentifier12;
    }

    public void setOtherProviderIdentifier12(final String otherProviderIdentifier12) {
        this.otherProviderIdentifier12 = otherProviderIdentifier12;
    }

    public String getOtherProviderIdentifierTypeCode12() {
        return otherProviderIdentifierTypeCode12;
    }

    public void setOtherProviderIdentifierTypeCode12(final String otherProviderIdentifierTypeCode12) {
        this.otherProviderIdentifierTypeCode12 = otherProviderIdentifierTypeCode12;
    }

    public String getOtherProviderIdentifierState12() {
        return otherProviderIdentifierState12;
    }

    public void setOtherProviderIdentifierState12(final String otherProviderIdentifierState12) {
        this.otherProviderIdentifierState12 = otherProviderIdentifierState12;
    }

    public String getOtherProviderIdentifierIssuer12() {
        return otherProviderIdentifierIssuer12;
    }

    public void setOtherProviderIdentifierIssuer12(final String otherProviderIdentifierIssuer12) {
        this.otherProviderIdentifierIssuer12 = otherProviderIdentifierIssuer12;
    }

    public String getOtherProviderIdentifier13() {
        return otherProviderIdentifier13;
    }

    public void setOtherProviderIdentifier13(final String otherProviderIdentifier13) {
        this.otherProviderIdentifier13 = otherProviderIdentifier13;
    }

    public String getOtherProviderIdentifierTypeCode13() {
        return otherProviderIdentifierTypeCode13;
    }

    public void setOtherProviderIdentifierTypeCode13(final String otherProviderIdentifierTypeCode13) {
        this.otherProviderIdentifierTypeCode13 = otherProviderIdentifierTypeCode13;
    }

    public String getOtherProviderIdentifierState13() {
        return otherProviderIdentifierState13;
    }

    public void setOtherProviderIdentifierState13(final String otherProviderIdentifierState13) {
        this.otherProviderIdentifierState13 = otherProviderIdentifierState13;
    }

    public String getOtherProviderIdentifierIssuer13() {
        return otherProviderIdentifierIssuer13;
    }

    public void setOtherProviderIdentifierIssuer13(final String otherProviderIdentifierIssuer13) {
        this.otherProviderIdentifierIssuer13 = otherProviderIdentifierIssuer13;
    }

    public String getOtherProviderIdentifier14() {
        return otherProviderIdentifier14;
    }

    public void setOtherProviderIdentifier14(final String otherProviderIdentifier14) {
        this.otherProviderIdentifier14 = otherProviderIdentifier14;
    }

    public String getOtherProviderIdentifierTypeCode14() {
        return otherProviderIdentifierTypeCode14;
    }

    public void setOtherProviderIdentifierTypeCode14(final String otherProviderIdentifierTypeCode14) {
        this.otherProviderIdentifierTypeCode14 = otherProviderIdentifierTypeCode14;
    }

    public String getOtherProviderIdentifierState14() {
        return otherProviderIdentifierState14;
    }

    public void setOtherProviderIdentifierState14(final String otherProviderIdentifierState14) {
        this.otherProviderIdentifierState14 = otherProviderIdentifierState14;
    }

    public String getOtherProviderIdentifierIssuer14() {
        return otherProviderIdentifierIssuer14;
    }

    public void setOtherProviderIdentifierIssuer14(final String otherProviderIdentifierIssuer14) {
        this.otherProviderIdentifierIssuer14 = otherProviderIdentifierIssuer14;
    }

    public String getOtherProviderIdentifier15() {
        return otherProviderIdentifier15;
    }

    public void setOtherProviderIdentifier15(final String otherProviderIdentifier15) {
        this.otherProviderIdentifier15 = otherProviderIdentifier15;
    }

    public String getOtherProviderIdentifierTypeCode15() {
        return otherProviderIdentifierTypeCode15;
    }

    public void setOtherProviderIdentifierTypeCode15(final String otherProviderIdentifierTypeCode15) {
        this.otherProviderIdentifierTypeCode15 = otherProviderIdentifierTypeCode15;
    }

    public String getOtherProviderIdentifierState15() {
        return otherProviderIdentifierState15;
    }

    public void setOtherProviderIdentifierState15(final String otherProviderIdentifierState15) {
        this.otherProviderIdentifierState15 = otherProviderIdentifierState15;
    }

    public String getOtherProviderIdentifierIssuer15() {
        return otherProviderIdentifierIssuer15;
    }

    public void setOtherProviderIdentifierIssuer15(final String otherProviderIdentifierIssuer15) {
        this.otherProviderIdentifierIssuer15 = otherProviderIdentifierIssuer15;
    }

    public String getOtherProviderIdentifier16() {
        return otherProviderIdentifier16;
    }

    public void setOtherProviderIdentifier16(final String otherProviderIdentifier16) {
        this.otherProviderIdentifier16 = otherProviderIdentifier16;
    }

    public String getOtherProviderIdentifierTypeCode16() {
        return otherProviderIdentifierTypeCode16;
    }

    public void setOtherProviderIdentifierTypeCode16(final String otherProviderIdentifierTypeCode16) {
        this.otherProviderIdentifierTypeCode16 = otherProviderIdentifierTypeCode16;
    }

    public String getOtherProviderIdentifierState16() {
        return otherProviderIdentifierState16;
    }

    public void setOtherProviderIdentifierState16(final String otherProviderIdentifierState16) {
        this.otherProviderIdentifierState16 = otherProviderIdentifierState16;
    }

    public String getOtherProviderIdentifierIssuer16() {
        return otherProviderIdentifierIssuer16;
    }

    public void setOtherProviderIdentifierIssuer16(final String otherProviderIdentifierIssuer16) {
        this.otherProviderIdentifierIssuer16 = otherProviderIdentifierIssuer16;
    }

    public String getOtherProviderIdentifier17() {
        return otherProviderIdentifier17;
    }

    public void setOtherProviderIdentifier17(final String otherProviderIdentifier17) {
        this.otherProviderIdentifier17 = otherProviderIdentifier17;
    }

    public String getOtherProviderIdentifierTypeCode17() {
        return otherProviderIdentifierTypeCode17;
    }

    public void setOtherProviderIdentifierTypeCode17(final String otherProviderIdentifierTypeCode17) {
        this.otherProviderIdentifierTypeCode17 = otherProviderIdentifierTypeCode17;
    }

    public String getOtherProviderIdentifierState17() {
        return otherProviderIdentifierState17;
    }

    public void setOtherProviderIdentifierState17(final String otherProviderIdentifierState17) {
        this.otherProviderIdentifierState17 = otherProviderIdentifierState17;
    }

    public String getOtherProviderIdentifierIssuer17() {
        return otherProviderIdentifierIssuer17;
    }

    public void setOtherProviderIdentifierIssuer17(final String otherProviderIdentifierIssuer17) {
        this.otherProviderIdentifierIssuer17 = otherProviderIdentifierIssuer17;
    }

    public String getOtherProviderIdentifier18() {
        return otherProviderIdentifier18;
    }

    public void setOtherProviderIdentifier18(final String otherProviderIdentifier18) {
        this.otherProviderIdentifier18 = otherProviderIdentifier18;
    }

    public String getOtherProviderIdentifierTypeCode18() {
        return otherProviderIdentifierTypeCode18;
    }

    public void setOtherProviderIdentifierTypeCode18(final String otherProviderIdentifierTypeCode18) {
        this.otherProviderIdentifierTypeCode18 = otherProviderIdentifierTypeCode18;
    }

    public String getOtherProviderIdentifierState18() {
        return otherProviderIdentifierState18;
    }

    public void setOtherProviderIdentifierState18(final String otherProviderIdentifierState18) {
        this.otherProviderIdentifierState18 = otherProviderIdentifierState18;
    }

    public String getOtherProviderIdentifierIssuer18() {
        return otherProviderIdentifierIssuer18;
    }

    public void setOtherProviderIdentifierIssuer18(final String otherProviderIdentifierIssuer18) {
        this.otherProviderIdentifierIssuer18 = otherProviderIdentifierIssuer18;
    }

    public String getOtherProviderIdentifier19() {
        return otherProviderIdentifier19;
    }

    public void setOtherProviderIdentifier19(final String otherProviderIdentifier19) {
        this.otherProviderIdentifier19 = otherProviderIdentifier19;
    }

    public String getOtherProviderIdentifierTypeCode19() {
        return otherProviderIdentifierTypeCode19;
    }

    public void setOtherProviderIdentifierTypeCode19(final String otherProviderIdentifierTypeCode19) {
        this.otherProviderIdentifierTypeCode19 = otherProviderIdentifierTypeCode19;
    }

    public String getOtherProviderIdentifierState19() {
        return otherProviderIdentifierState19;
    }

    public void setOtherProviderIdentifierState19(final String otherProviderIdentifierState19) {
        this.otherProviderIdentifierState19 = otherProviderIdentifierState19;
    }

    public String getOtherProviderIdentifierIssuer19() {
        return otherProviderIdentifierIssuer19;
    }

    public void setOtherProviderIdentifierIssuer19(final String otherProviderIdentifierIssuer19) {
        this.otherProviderIdentifierIssuer19 = otherProviderIdentifierIssuer19;
    }

    public String getOtherProviderIdentifier20() {
        return otherProviderIdentifier20;
    }

    public void setOtherProviderIdentifier20(final String otherProviderIdentifier20) {
        this.otherProviderIdentifier20 = otherProviderIdentifier20;
    }

    public String getOtherProviderIdentifierTypeCode20() {
        return otherProviderIdentifierTypeCode20;
    }

    public void setOtherProviderIdentifierTypeCode20(final String otherProviderIdentifierTypeCode20) {
        this.otherProviderIdentifierTypeCode20 = otherProviderIdentifierTypeCode20;
    }

    public String getOtherProviderIdentifierState20() {
        return otherProviderIdentifierState20;
    }

    public void setOtherProviderIdentifierState20(final String otherProviderIdentifierState20) {
        this.otherProviderIdentifierState20 = otherProviderIdentifierState20;
    }

    public String getOtherProviderIdentifierIssuer20() {
        return otherProviderIdentifierIssuer20;
    }

    public void setOtherProviderIdentifierIssuer20(final String otherProviderIdentifierIssuer20) {
        this.otherProviderIdentifierIssuer20 = otherProviderIdentifierIssuer20;
    }

    public String getOtherProviderIdentifier21() {
        return otherProviderIdentifier21;
    }

    public void setOtherProviderIdentifier21(final String otherProviderIdentifier21) {
        this.otherProviderIdentifier21 = otherProviderIdentifier21;
    }

    public String getOtherProviderIdentifierTypeCode21() {
        return otherProviderIdentifierTypeCode21;
    }

    public void setOtherProviderIdentifierTypeCode21(final String otherProviderIdentifierTypeCode21) {
        this.otherProviderIdentifierTypeCode21 = otherProviderIdentifierTypeCode21;
    }

    public String getOtherProviderIdentifierState21() {
        return otherProviderIdentifierState21;
    }

    public void setOtherProviderIdentifierState21(final String otherProviderIdentifierState21) {
        this.otherProviderIdentifierState21 = otherProviderIdentifierState21;
    }

    public String getOtherProviderIdentifierIssuer21() {
        return otherProviderIdentifierIssuer21;
    }

    public void setOtherProviderIdentifierIssuer21(final String otherProviderIdentifierIssuer21) {
        this.otherProviderIdentifierIssuer21 = otherProviderIdentifierIssuer21;
    }

    public String getOtherProviderIdentifier22() {
        return otherProviderIdentifier22;
    }

    public void setOtherProviderIdentifier22(final String otherProviderIdentifier22) {
        this.otherProviderIdentifier22 = otherProviderIdentifier22;
    }

    public String getOtherProviderIdentifierTypeCode22() {
        return otherProviderIdentifierTypeCode22;
    }

    public void setOtherProviderIdentifierTypeCode22(final String otherProviderIdentifierTypeCode22) {
        this.otherProviderIdentifierTypeCode22 = otherProviderIdentifierTypeCode22;
    }

    public String getOtherProviderIdentifierState22() {
        return otherProviderIdentifierState22;
    }

    public void setOtherProviderIdentifierState22(final String otherProviderIdentifierState22) {
        this.otherProviderIdentifierState22 = otherProviderIdentifierState22;
    }

    public String getOtherProviderIdentifierIssuer22() {
        return otherProviderIdentifierIssuer22;
    }

    public void setOtherProviderIdentifierIssuer22(final String otherProviderIdentifierIssuer22) {
        this.otherProviderIdentifierIssuer22 = otherProviderIdentifierIssuer22;
    }

    public String getOtherProviderIdentifier23() {
        return otherProviderIdentifier23;
    }

    public void setOtherProviderIdentifier23(final String otherProviderIdentifier23) {
        this.otherProviderIdentifier23 = otherProviderIdentifier23;
    }

    public String getOtherProviderIdentifierTypeCode23() {
        return otherProviderIdentifierTypeCode23;
    }

    public void setOtherProviderIdentifierTypeCode23(final String otherProviderIdentifierTypeCode23) {
        this.otherProviderIdentifierTypeCode23 = otherProviderIdentifierTypeCode23;
    }

    public String getOtherProviderIdentifierState23() {
        return otherProviderIdentifierState23;
    }

    public void setOtherProviderIdentifierState23(final String otherProviderIdentifierState23) {
        this.otherProviderIdentifierState23 = otherProviderIdentifierState23;
    }

    public String getOtherProviderIdentifierIssuer23() {
        return otherProviderIdentifierIssuer23;
    }

    public void setOtherProviderIdentifierIssuer23(final String otherProviderIdentifierIssuer23) {
        this.otherProviderIdentifierIssuer23 = otherProviderIdentifierIssuer23;
    }

    public String getOtherProviderIdentifier24() {
        return otherProviderIdentifier24;
    }

    public void setOtherProviderIdentifier24(final String otherProviderIdentifier24) {
        this.otherProviderIdentifier24 = otherProviderIdentifier24;
    }

    public String getOtherProviderIdentifierTypeCode24() {
        return otherProviderIdentifierTypeCode24;
    }

    public void setOtherProviderIdentifierTypeCode24(final String otherProviderIdentifierTypeCode24) {
        this.otherProviderIdentifierTypeCode24 = otherProviderIdentifierTypeCode24;
    }

    public String getOtherProviderIdentifierState24() {
        return otherProviderIdentifierState24;
    }

    public void setOtherProviderIdentifierState24(final String otherProviderIdentifierState24) {
        this.otherProviderIdentifierState24 = otherProviderIdentifierState24;
    }

    public String getOtherProviderIdentifierIssuer24() {
        return otherProviderIdentifierIssuer24;
    }

    public void setOtherProviderIdentifierIssuer24(final String otherProviderIdentifierIssuer24) {
        this.otherProviderIdentifierIssuer24 = otherProviderIdentifierIssuer24;
    }

    public String getOtherProviderIdentifier25() {
        return otherProviderIdentifier25;
    }

    public void setOtherProviderIdentifier25(final String otherProviderIdentifier25) {
        this.otherProviderIdentifier25 = otherProviderIdentifier25;
    }

    public String getOtherProviderIdentifierTypeCode25() {
        return otherProviderIdentifierTypeCode25;
    }

    public void setOtherProviderIdentifierTypeCode25(final String otherProviderIdentifierTypeCode25) {
        this.otherProviderIdentifierTypeCode25 = otherProviderIdentifierTypeCode25;
    }

    public String getOtherProviderIdentifierState25() {
        return otherProviderIdentifierState25;
    }

    public void setOtherProviderIdentifierState25(final String otherProviderIdentifierState25) {
        this.otherProviderIdentifierState25 = otherProviderIdentifierState25;
    }

    public String getOtherProviderIdentifierIssuer25() {
        return otherProviderIdentifierIssuer25;
    }

    public void setOtherProviderIdentifierIssuer25(final String otherProviderIdentifierIssuer25) {
        this.otherProviderIdentifierIssuer25 = otherProviderIdentifierIssuer25;
    }

    public String getOtherProviderIdentifier26() {
        return otherProviderIdentifier26;
    }

    public void setOtherProviderIdentifier26(final String otherProviderIdentifier26) {
        this.otherProviderIdentifier26 = otherProviderIdentifier26;
    }

    public String getOtherProviderIdentifierTypeCode26() {
        return otherProviderIdentifierTypeCode26;
    }

    public void setOtherProviderIdentifierTypeCode26(final String otherProviderIdentifierTypeCode26) {
        this.otherProviderIdentifierTypeCode26 = otherProviderIdentifierTypeCode26;
    }

    public String getOtherProviderIdentifierState26() {
        return otherProviderIdentifierState26;
    }

    public void setOtherProviderIdentifierState26(final String otherProviderIdentifierState26) {
        this.otherProviderIdentifierState26 = otherProviderIdentifierState26;
    }

    public String getOtherProviderIdentifierIssuer26() {
        return otherProviderIdentifierIssuer26;
    }

    public void setOtherProviderIdentifierIssuer26(final String otherProviderIdentifierIssuer26) {
        this.otherProviderIdentifierIssuer26 = otherProviderIdentifierIssuer26;
    }

    public String getOtherProviderIdentifier27() {
        return otherProviderIdentifier27;
    }

    public void setOtherProviderIdentifier27(final String otherProviderIdentifier27) {
        this.otherProviderIdentifier27 = otherProviderIdentifier27;
    }

    public String getOtherProviderIdentifierTypeCode27() {
        return otherProviderIdentifierTypeCode27;
    }

    public void setOtherProviderIdentifierTypeCode27(final String otherProviderIdentifierTypeCode27) {
        this.otherProviderIdentifierTypeCode27 = otherProviderIdentifierTypeCode27;
    }

    public String getOtherProviderIdentifierState27() {
        return otherProviderIdentifierState27;
    }

    public void setOtherProviderIdentifierState27(final String otherProviderIdentifierState27) {
        this.otherProviderIdentifierState27 = otherProviderIdentifierState27;
    }

    public String getOtherProviderIdentifierIssuer27() {
        return otherProviderIdentifierIssuer27;
    }

    public void setOtherProviderIdentifierIssuer27(final String otherProviderIdentifierIssuer27) {
        this.otherProviderIdentifierIssuer27 = otherProviderIdentifierIssuer27;
    }

    public String getOtherProviderIdentifier28() {
        return otherProviderIdentifier28;
    }

    public void setOtherProviderIdentifier28(final String otherProviderIdentifier28) {
        this.otherProviderIdentifier28 = otherProviderIdentifier28;
    }

    public String getOtherProviderIdentifierTypeCode28() {
        return otherProviderIdentifierTypeCode28;
    }

    public void setOtherProviderIdentifierTypeCode28(final String otherProviderIdentifierTypeCode28) {
        this.otherProviderIdentifierTypeCode28 = otherProviderIdentifierTypeCode28;
    }

    public String getOtherProviderIdentifierState28() {
        return otherProviderIdentifierState28;
    }

    public void setOtherProviderIdentifierState28(final String otherProviderIdentifierState28) {
        this.otherProviderIdentifierState28 = otherProviderIdentifierState28;
    }

    public String getOtherProviderIdentifierIssuer28() {
        return otherProviderIdentifierIssuer28;
    }

    public void setOtherProviderIdentifierIssuer28(final String otherProviderIdentifierIssuer28) {
        this.otherProviderIdentifierIssuer28 = otherProviderIdentifierIssuer28;
    }

    public String getOtherProviderIdentifier29() {
        return otherProviderIdentifier29;
    }

    public void setOtherProviderIdentifier29(final String otherProviderIdentifier29) {
        this.otherProviderIdentifier29 = otherProviderIdentifier29;
    }

    public String getOtherProviderIdentifierTypeCode29() {
        return otherProviderIdentifierTypeCode29;
    }

    public void setOtherProviderIdentifierTypeCode29(final String otherProviderIdentifierTypeCode29) {
        this.otherProviderIdentifierTypeCode29 = otherProviderIdentifierTypeCode29;
    }

    public String getOtherProviderIdentifierState29() {
        return otherProviderIdentifierState29;
    }

    public void setOtherProviderIdentifierState29(final String otherProviderIdentifierState29) {
        this.otherProviderIdentifierState29 = otherProviderIdentifierState29;
    }

    public String getOtherProviderIdentifierIssuer29() {
        return otherProviderIdentifierIssuer29;
    }

    public void setOtherProviderIdentifierIssuer29(final String otherProviderIdentifierIssuer29) {
        this.otherProviderIdentifierIssuer29 = otherProviderIdentifierIssuer29;
    }

    public String getOtherProviderIdentifier30() {
        return otherProviderIdentifier30;
    }

    public void setOtherProviderIdentifier30(final String otherProviderIdentifier30) {
        this.otherProviderIdentifier30 = otherProviderIdentifier30;
    }

    public String getOtherProviderIdentifierTypeCode30() {
        return otherProviderIdentifierTypeCode30;
    }

    public void setOtherProviderIdentifierTypeCode30(final String otherProviderIdentifierTypeCode30) {
        this.otherProviderIdentifierTypeCode30 = otherProviderIdentifierTypeCode30;
    }

    public String getOtherProviderIdentifierState30() {
        return otherProviderIdentifierState30;
    }

    public void setOtherProviderIdentifierState30(final String otherProviderIdentifierState30) {
        this.otherProviderIdentifierState30 = otherProviderIdentifierState30;
    }

    public String getOtherProviderIdentifierIssuer30() {
        return otherProviderIdentifierIssuer30;
    }

    public void setOtherProviderIdentifierIssuer30(final String otherProviderIdentifierIssuer30) {
        this.otherProviderIdentifierIssuer30 = otherProviderIdentifierIssuer30;
    }

    public String getOtherProviderIdentifier31() {
        return otherProviderIdentifier31;
    }

    public void setOtherProviderIdentifier31(final String otherProviderIdentifier31) {
        this.otherProviderIdentifier31 = otherProviderIdentifier31;
    }

    public String getOtherProviderIdentifierTypeCode31() {
        return otherProviderIdentifierTypeCode31;
    }

    public void setOtherProviderIdentifierTypeCode31(final String otherProviderIdentifierTypeCode31) {
        this.otherProviderIdentifierTypeCode31 = otherProviderIdentifierTypeCode31;
    }

    public String getOtherProviderIdentifierState31() {
        return otherProviderIdentifierState31;
    }

    public void setOtherProviderIdentifierState31(final String otherProviderIdentifierState31) {
        this.otherProviderIdentifierState31 = otherProviderIdentifierState31;
    }

    public String getOtherProviderIdentifierIssuer31() {
        return otherProviderIdentifierIssuer31;
    }

    public void setOtherProviderIdentifierIssuer31(final String otherProviderIdentifierIssuer31) {
        this.otherProviderIdentifierIssuer31 = otherProviderIdentifierIssuer31;
    }

    public String getOtherProviderIdentifier32() {
        return otherProviderIdentifier32;
    }

    public void setOtherProviderIdentifier32(final String otherProviderIdentifier32) {
        this.otherProviderIdentifier32 = otherProviderIdentifier32;
    }

    public String getOtherProviderIdentifierTypeCode32() {
        return otherProviderIdentifierTypeCode32;
    }

    public void setOtherProviderIdentifierTypeCode32(final String otherProviderIdentifierTypeCode32) {
        this.otherProviderIdentifierTypeCode32 = otherProviderIdentifierTypeCode32;
    }

    public String getOtherProviderIdentifierState32() {
        return otherProviderIdentifierState32;
    }

    public void setOtherProviderIdentifierState32(final String otherProviderIdentifierState32) {
        this.otherProviderIdentifierState32 = otherProviderIdentifierState32;
    }

    public String getOtherProviderIdentifierIssuer32() {
        return otherProviderIdentifierIssuer32;
    }

    public void setOtherProviderIdentifierIssuer32(final String otherProviderIdentifierIssuer32) {
        this.otherProviderIdentifierIssuer32 = otherProviderIdentifierIssuer32;
    }

    public String getOtherProviderIdentifier33() {
        return otherProviderIdentifier33;
    }

    public void setOtherProviderIdentifier33(final String otherProviderIdentifier33) {
        this.otherProviderIdentifier33 = otherProviderIdentifier33;
    }

    public String getOtherProviderIdentifierTypeCode33() {
        return otherProviderIdentifierTypeCode33;
    }

    public void setOtherProviderIdentifierTypeCode33(final String otherProviderIdentifierTypeCode33) {
        this.otherProviderIdentifierTypeCode33 = otherProviderIdentifierTypeCode33;
    }

    public String getOtherProviderIdentifierState33() {
        return otherProviderIdentifierState33;
    }

    public void setOtherProviderIdentifierState33(final String otherProviderIdentifierState33) {
        this.otherProviderIdentifierState33 = otherProviderIdentifierState33;
    }

    public String getOtherProviderIdentifierIssuer33() {
        return otherProviderIdentifierIssuer33;
    }

    public void setOtherProviderIdentifierIssuer33(final String otherProviderIdentifierIssuer33) {
        this.otherProviderIdentifierIssuer33 = otherProviderIdentifierIssuer33;
    }

    public String getOtherProviderIdentifier34() {
        return otherProviderIdentifier34;
    }

    public void setOtherProviderIdentifier34(final String otherProviderIdentifier34) {
        this.otherProviderIdentifier34 = otherProviderIdentifier34;
    }

    public String getOtherProviderIdentifierTypeCode34() {
        return otherProviderIdentifierTypeCode34;
    }

    public void setOtherProviderIdentifierTypeCode34(final String otherProviderIdentifierTypeCode34) {
        this.otherProviderIdentifierTypeCode34 = otherProviderIdentifierTypeCode34;
    }

    public String getOtherProviderIdentifierState34() {
        return otherProviderIdentifierState34;
    }

    public void setOtherProviderIdentifierState34(final String otherProviderIdentifierState34) {
        this.otherProviderIdentifierState34 = otherProviderIdentifierState34;
    }

    public String getOtherProviderIdentifierIssuer34() {
        return otherProviderIdentifierIssuer34;
    }

    public void setOtherProviderIdentifierIssuer34(final String otherProviderIdentifierIssuer34) {
        this.otherProviderIdentifierIssuer34 = otherProviderIdentifierIssuer34;
    }

    public String getOtherProviderIdentifier35() {
        return otherProviderIdentifier35;
    }

    public void setOtherProviderIdentifier35(final String otherProviderIdentifier35) {
        this.otherProviderIdentifier35 = otherProviderIdentifier35;
    }

    public String getOtherProviderIdentifierTypeCode35() {
        return otherProviderIdentifierTypeCode35;
    }

    public void setOtherProviderIdentifierTypeCode35(final String otherProviderIdentifierTypeCode35) {
        this.otherProviderIdentifierTypeCode35 = otherProviderIdentifierTypeCode35;
    }

    public String getOtherProviderIdentifierState35() {
        return otherProviderIdentifierState35;
    }

    public void setOtherProviderIdentifierState35(final String otherProviderIdentifierState35) {
        this.otherProviderIdentifierState35 = otherProviderIdentifierState35;
    }

    public String getOtherProviderIdentifierIssuer35() {
        return otherProviderIdentifierIssuer35;
    }

    public void setOtherProviderIdentifierIssuer35(final String otherProviderIdentifierIssuer35) {
        this.otherProviderIdentifierIssuer35 = otherProviderIdentifierIssuer35;
    }

    public String getOtherProviderIdentifier36() {
        return otherProviderIdentifier36;
    }

    public void setOtherProviderIdentifier36(final String otherProviderIdentifier36) {
        this.otherProviderIdentifier36 = otherProviderIdentifier36;
    }

    public String getOtherProviderIdentifierTypeCode36() {
        return otherProviderIdentifierTypeCode36;
    }

    public void setOtherProviderIdentifierTypeCode36(final String otherProviderIdentifierTypeCode36) {
        this.otherProviderIdentifierTypeCode36 = otherProviderIdentifierTypeCode36;
    }

    public String getOtherProviderIdentifierState36() {
        return otherProviderIdentifierState36;
    }

    public void setOtherProviderIdentifierState36(final String otherProviderIdentifierState36) {
        this.otherProviderIdentifierState36 = otherProviderIdentifierState36;
    }

    public String getOtherProviderIdentifierIssuer36() {
        return otherProviderIdentifierIssuer36;
    }

    public void setOtherProviderIdentifierIssuer36(final String otherProviderIdentifierIssuer36) {
        this.otherProviderIdentifierIssuer36 = otherProviderIdentifierIssuer36;
    }

    public String getOtherProviderIdentifier37() {
        return otherProviderIdentifier37;
    }

    public void setOtherProviderIdentifier37(final String otherProviderIdentifier37) {
        this.otherProviderIdentifier37 = otherProviderIdentifier37;
    }

    public String getOtherProviderIdentifierTypeCode37() {
        return otherProviderIdentifierTypeCode37;
    }

    public void setOtherProviderIdentifierTypeCode37(final String otherProviderIdentifierTypeCode37) {
        this.otherProviderIdentifierTypeCode37 = otherProviderIdentifierTypeCode37;
    }

    public String getOtherProviderIdentifierState37() {
        return otherProviderIdentifierState37;
    }

    public void setOtherProviderIdentifierState37(final String otherProviderIdentifierState37) {
        this.otherProviderIdentifierState37 = otherProviderIdentifierState37;
    }

    public String getOtherProviderIdentifierIssuer37() {
        return otherProviderIdentifierIssuer37;
    }

    public void setOtherProviderIdentifierIssuer37(final String otherProviderIdentifierIssuer37) {
        this.otherProviderIdentifierIssuer37 = otherProviderIdentifierIssuer37;
    }

    public String getOtherProviderIdentifier38() {
        return otherProviderIdentifier38;
    }

    public void setOtherProviderIdentifier38(final String otherProviderIdentifier38) {
        this.otherProviderIdentifier38 = otherProviderIdentifier38;
    }

    public String getOtherProviderIdentifierTypeCode38() {
        return otherProviderIdentifierTypeCode38;
    }

    public void setOtherProviderIdentifierTypeCode38(final String otherProviderIdentifierTypeCode38) {
        this.otherProviderIdentifierTypeCode38 = otherProviderIdentifierTypeCode38;
    }

    public String getOtherProviderIdentifierState38() {
        return otherProviderIdentifierState38;
    }

    public void setOtherProviderIdentifierState38(final String otherProviderIdentifierState38) {
        this.otherProviderIdentifierState38 = otherProviderIdentifierState38;
    }

    public String getOtherProviderIdentifierIssuer38() {
        return otherProviderIdentifierIssuer38;
    }

    public void setOtherProviderIdentifierIssuer38(final String otherProviderIdentifierIssuer38) {
        this.otherProviderIdentifierIssuer38 = otherProviderIdentifierIssuer38;
    }

    public String getOtherProviderIdentifier39() {
        return otherProviderIdentifier39;
    }

    public void setOtherProviderIdentifier39(final String otherProviderIdentifier39) {
        this.otherProviderIdentifier39 = otherProviderIdentifier39;
    }

    public String getOtherProviderIdentifierTypeCode39() {
        return otherProviderIdentifierTypeCode39;
    }

    public void setOtherProviderIdentifierTypeCode39(final String otherProviderIdentifierTypeCode39) {
        this.otherProviderIdentifierTypeCode39 = otherProviderIdentifierTypeCode39;
    }

    public String getOtherProviderIdentifierState39() {
        return otherProviderIdentifierState39;
    }

    public void setOtherProviderIdentifierState39(final String otherProviderIdentifierState39) {
        this.otherProviderIdentifierState39 = otherProviderIdentifierState39;
    }

    public String getOtherProviderIdentifierIssuer39() {
        return otherProviderIdentifierIssuer39;
    }

    public void setOtherProviderIdentifierIssuer39(final String otherProviderIdentifierIssuer39) {
        this.otherProviderIdentifierIssuer39 = otherProviderIdentifierIssuer39;
    }

    public String getOtherProviderIdentifier40() {
        return otherProviderIdentifier40;
    }

    public void setOtherProviderIdentifier40(final String otherProviderIdentifier40) {
        this.otherProviderIdentifier40 = otherProviderIdentifier40;
    }

    public String getOtherProviderIdentifierTypeCode40() {
        return otherProviderIdentifierTypeCode40;
    }

    public void setOtherProviderIdentifierTypeCode40(final String otherProviderIdentifierTypeCode40) {
        this.otherProviderIdentifierTypeCode40 = otherProviderIdentifierTypeCode40;
    }

    public String getOtherProviderIdentifierState40() {
        return otherProviderIdentifierState40;
    }

    public void setOtherProviderIdentifierState40(final String otherProviderIdentifierState40) {
        this.otherProviderIdentifierState40 = otherProviderIdentifierState40;
    }

    public String getOtherProviderIdentifierIssuer40() {
        return otherProviderIdentifierIssuer40;
    }

    public void setOtherProviderIdentifierIssuer40(final String otherProviderIdentifierIssuer40) {
        this.otherProviderIdentifierIssuer40 = otherProviderIdentifierIssuer40;
    }

    public String getOtherProviderIdentifier41() {
        return otherProviderIdentifier41;
    }

    public void setOtherProviderIdentifier41(final String otherProviderIdentifier41) {
        this.otherProviderIdentifier41 = otherProviderIdentifier41;
    }

    public String getOtherProviderIdentifierTypeCode41() {
        return otherProviderIdentifierTypeCode41;
    }

    public void setOtherProviderIdentifierTypeCode41(final String otherProviderIdentifierTypeCode41) {
        this.otherProviderIdentifierTypeCode41 = otherProviderIdentifierTypeCode41;
    }

    public String getOtherProviderIdentifierState41() {
        return otherProviderIdentifierState41;
    }

    public void setOtherProviderIdentifierState41(final String otherProviderIdentifierState41) {
        this.otherProviderIdentifierState41 = otherProviderIdentifierState41;
    }

    public String getOtherProviderIdentifierIssuer41() {
        return otherProviderIdentifierIssuer41;
    }

    public void setOtherProviderIdentifierIssuer41(final String otherProviderIdentifierIssuer41) {
        this.otherProviderIdentifierIssuer41 = otherProviderIdentifierIssuer41;
    }

    public String getOtherProviderIdentifier42() {
        return otherProviderIdentifier42;
    }

    public void setOtherProviderIdentifier42(final String otherProviderIdentifier42) {
        this.otherProviderIdentifier42 = otherProviderIdentifier42;
    }

    public String getOtherProviderIdentifierTypeCode42() {
        return otherProviderIdentifierTypeCode42;
    }

    public void setOtherProviderIdentifierTypeCode42(final String otherProviderIdentifierTypeCode42) {
        this.otherProviderIdentifierTypeCode42 = otherProviderIdentifierTypeCode42;
    }

    public String getOtherProviderIdentifierState42() {
        return otherProviderIdentifierState42;
    }

    public void setOtherProviderIdentifierState42(final String otherProviderIdentifierState42) {
        this.otherProviderIdentifierState42 = otherProviderIdentifierState42;
    }

    public String getOtherProviderIdentifierIssuer42() {
        return otherProviderIdentifierIssuer42;
    }

    public void setOtherProviderIdentifierIssuer42(final String otherProviderIdentifierIssuer42) {
        this.otherProviderIdentifierIssuer42 = otherProviderIdentifierIssuer42;
    }

    public String getOtherProviderIdentifier43() {
        return otherProviderIdentifier43;
    }

    public void setOtherProviderIdentifier43(final String otherProviderIdentifier43) {
        this.otherProviderIdentifier43 = otherProviderIdentifier43;
    }

    public String getOtherProviderIdentifierTypeCode43() {
        return otherProviderIdentifierTypeCode43;
    }

    public void setOtherProviderIdentifierTypeCode43(final String otherProviderIdentifierTypeCode43) {
        this.otherProviderIdentifierTypeCode43 = otherProviderIdentifierTypeCode43;
    }

    public String getOtherProviderIdentifierState43() {
        return otherProviderIdentifierState43;
    }

    public void setOtherProviderIdentifierState43(final String otherProviderIdentifierState43) {
        this.otherProviderIdentifierState43 = otherProviderIdentifierState43;
    }

    public String getOtherProviderIdentifierIssuer43() {
        return otherProviderIdentifierIssuer43;
    }

    public void setOtherProviderIdentifierIssuer43(final String otherProviderIdentifierIssuer43) {
        this.otherProviderIdentifierIssuer43 = otherProviderIdentifierIssuer43;
    }

    public String getOtherProviderIdentifier44() {
        return otherProviderIdentifier44;
    }

    public void setOtherProviderIdentifier44(final String otherProviderIdentifier44) {
        this.otherProviderIdentifier44 = otherProviderIdentifier44;
    }

    public String getOtherProviderIdentifierTypeCode44() {
        return otherProviderIdentifierTypeCode44;
    }

    public void setOtherProviderIdentifierTypeCode44(final String otherProviderIdentifierTypeCode44) {
        this.otherProviderIdentifierTypeCode44 = otherProviderIdentifierTypeCode44;
    }

    public String getOtherProviderIdentifierState44() {
        return otherProviderIdentifierState44;
    }

    public void setOtherProviderIdentifierState44(final String otherProviderIdentifierState44) {
        this.otherProviderIdentifierState44 = otherProviderIdentifierState44;
    }

    public String getOtherProviderIdentifierIssuer44() {
        return otherProviderIdentifierIssuer44;
    }

    public void setOtherProviderIdentifierIssuer44(final String otherProviderIdentifierIssuer44) {
        this.otherProviderIdentifierIssuer44 = otherProviderIdentifierIssuer44;
    }

    public String getOtherProviderIdentifier45() {
        return otherProviderIdentifier45;
    }

    public void setOtherProviderIdentifier45(final String otherProviderIdentifier45) {
        this.otherProviderIdentifier45 = otherProviderIdentifier45;
    }

    public String getOtherProviderIdentifierTypeCode45() {
        return otherProviderIdentifierTypeCode45;
    }

    public void setOtherProviderIdentifierTypeCode45(final String otherProviderIdentifierTypeCode45) {
        this.otherProviderIdentifierTypeCode45 = otherProviderIdentifierTypeCode45;
    }

    public String getOtherProviderIdentifierState45() {
        return otherProviderIdentifierState45;
    }

    public void setOtherProviderIdentifierState45(final String otherProviderIdentifierState45) {
        this.otherProviderIdentifierState45 = otherProviderIdentifierState45;
    }

    public String getOtherProviderIdentifierIssuer45() {
        return otherProviderIdentifierIssuer45;
    }

    public void setOtherProviderIdentifierIssuer45(final String otherProviderIdentifierIssuer45) {
        this.otherProviderIdentifierIssuer45 = otherProviderIdentifierIssuer45;
    }

    public String getOtherProviderIdentifier46() {
        return otherProviderIdentifier46;
    }

    public void setOtherProviderIdentifier46(final String otherProviderIdentifier46) {
        this.otherProviderIdentifier46 = otherProviderIdentifier46;
    }

    public String getOtherProviderIdentifierTypeCode46() {
        return otherProviderIdentifierTypeCode46;
    }

    public void setOtherProviderIdentifierTypeCode46(final String otherProviderIdentifierTypeCode46) {
        this.otherProviderIdentifierTypeCode46 = otherProviderIdentifierTypeCode46;
    }

    public String getOtherProviderIdentifierState46() {
        return otherProviderIdentifierState46;
    }

    public void setOtherProviderIdentifierState46(final String otherProviderIdentifierState46) {
        this.otherProviderIdentifierState46 = otherProviderIdentifierState46;
    }

    public String getOtherProviderIdentifierIssuer46() {
        return otherProviderIdentifierIssuer46;
    }

    public void setOtherProviderIdentifierIssuer46(final String otherProviderIdentifierIssuer46) {
        this.otherProviderIdentifierIssuer46 = otherProviderIdentifierIssuer46;
    }

    public String getOtherProviderIdentifier47() {
        return otherProviderIdentifier47;
    }

    public void setOtherProviderIdentifier47(final String otherProviderIdentifier47) {
        this.otherProviderIdentifier47 = otherProviderIdentifier47;
    }

    public String getOtherProviderIdentifierTypeCode47() {
        return otherProviderIdentifierTypeCode47;
    }

    public void setOtherProviderIdentifierTypeCode47(final String otherProviderIdentifierTypeCode47) {
        this.otherProviderIdentifierTypeCode47 = otherProviderIdentifierTypeCode47;
    }

    public String getOtherProviderIdentifierState47() {
        return otherProviderIdentifierState47;
    }

    public void setOtherProviderIdentifierState47(final String otherProviderIdentifierState47) {
        this.otherProviderIdentifierState47 = otherProviderIdentifierState47;
    }

    public String getOtherProviderIdentifierIssuer47() {
        return otherProviderIdentifierIssuer47;
    }

    public void setOtherProviderIdentifierIssuer47(final String otherProviderIdentifierIssuer47) {
        this.otherProviderIdentifierIssuer47 = otherProviderIdentifierIssuer47;
    }

    public String getOtherProviderIdentifier48() {
        return otherProviderIdentifier48;
    }

    public void setOtherProviderIdentifier48(final String otherProviderIdentifier48) {
        this.otherProviderIdentifier48 = otherProviderIdentifier48;
    }

    public String getOtherProviderIdentifierTypeCode48() {
        return otherProviderIdentifierTypeCode48;
    }

    public void setOtherProviderIdentifierTypeCode48(final String otherProviderIdentifierTypeCode48) {
        this.otherProviderIdentifierTypeCode48 = otherProviderIdentifierTypeCode48;
    }

    public String getOtherProviderIdentifierState48() {
        return otherProviderIdentifierState48;
    }

    public void setOtherProviderIdentifierState48(final String otherProviderIdentifierState48) {
        this.otherProviderIdentifierState48 = otherProviderIdentifierState48;
    }

    public String getOtherProviderIdentifierIssuer48() {
        return otherProviderIdentifierIssuer48;
    }

    public void setOtherProviderIdentifierIssuer48(final String otherProviderIdentifierIssuer48) {
        this.otherProviderIdentifierIssuer48 = otherProviderIdentifierIssuer48;
    }

    public String getOtherProviderIdentifier49() {
        return otherProviderIdentifier49;
    }

    public void setOtherProviderIdentifier49(final String otherProviderIdentifier49) {
        this.otherProviderIdentifier49 = otherProviderIdentifier49;
    }

    public String getOtherProviderIdentifierTypeCode49() {
        return otherProviderIdentifierTypeCode49;
    }

    public void setOtherProviderIdentifierTypeCode49(final String otherProviderIdentifierTypeCode49) {
        this.otherProviderIdentifierTypeCode49 = otherProviderIdentifierTypeCode49;
    }

    public String getOtherProviderIdentifierState49() {
        return otherProviderIdentifierState49;
    }

    public void setOtherProviderIdentifierState49(final String otherProviderIdentifierState49) {
        this.otherProviderIdentifierState49 = otherProviderIdentifierState49;
    }

    public String getOtherProviderIdentifierIssuer49() {
        return otherProviderIdentifierIssuer49;
    }

    public void setOtherProviderIdentifierIssuer49(final String otherProviderIdentifierIssuer49) {
        this.otherProviderIdentifierIssuer49 = otherProviderIdentifierIssuer49;
    }

    public String getOtherProviderIdentifier50() {
        return otherProviderIdentifier50;
    }

    public void setOtherProviderIdentifier50(final String otherProviderIdentifier50) {
        this.otherProviderIdentifier50 = otherProviderIdentifier50;
    }

    public String getOtherProviderIdentifierTypeCode50() {
        return otherProviderIdentifierTypeCode50;
    }

    public void setOtherProviderIdentifierTypeCode50(final String otherProviderIdentifierTypeCode50) {
        this.otherProviderIdentifierTypeCode50 = otherProviderIdentifierTypeCode50;
    }

    public String getOtherProviderIdentifierState50() {
        return otherProviderIdentifierState50;
    }

    public void setOtherProviderIdentifierState50(final String otherProviderIdentifierState50) {
        this.otherProviderIdentifierState50 = otherProviderIdentifierState50;
    }

    public String getOtherProviderIdentifierIssuer50() {
        return otherProviderIdentifierIssuer50;
    }

    public void setOtherProviderIdentifierIssuer50(final String otherProviderIdentifierIssuer50) {
        this.otherProviderIdentifierIssuer50 = otherProviderIdentifierIssuer50;
    }

    public String getIsSoleProprietor() {
        return isSoleProprietor;
    }

    public void setIsSoleProprietor(final String isSoleProprietor) {
        this.isSoleProprietor = isSoleProprietor;
    }

    public String getIsOrganizationSubpart() {
        return isOrganizationSubpart;
    }

    public void setIsOrganizationSubpart(final String isOrganizationSubpart) {
        this.isOrganizationSubpart = isOrganizationSubpart;
    }

    public String getParentOrganizationLBN() {
        return parentOrganizationLBN;
    }

    public void setParentOrganizationLBN(final String parentOrganizationLBN) {
        this.parentOrganizationLBN = parentOrganizationLBN;
    }

    public String getParentOrganizationTIN() {
        return parentOrganizationTIN;
    }

    public void setParentOrganizationTIN(final String parentOrganizationTIN) {
        this.parentOrganizationTIN = parentOrganizationTIN;
    }

    public String getAuthorizedOfficialNamePrefixText() {
        return authorizedOfficialNamePrefixText;
    }

    public void setAuthorizedOfficialNamePrefixText(final String authorizedOfficialNamePrefixText) {
        this.authorizedOfficialNamePrefixText = authorizedOfficialNamePrefixText;
    }

    public String getAuthorizedOfficialNameSuffixText() {
        return authorizedOfficialNameSuffixText;
    }

    public void setAuthorizedOfficialNameSuffixText(final String authorizedOfficialNameSuffixText) {
        this.authorizedOfficialNameSuffixText = authorizedOfficialNameSuffixText;
    }

    public String getAuthorizedOfficialCredentialText() {
        return authorizedOfficialCredentialText;
    }

    public void setAuthorizedOfficialCredentialText(final String authorizedOfficialCredentialText) {
        this.authorizedOfficialCredentialText = authorizedOfficialCredentialText;
    }

    public String getHealthcareProviderTaxonomyGroup1() {
        return healthcareProviderTaxonomyGroup1;
    }

    public void setHealthcareProviderTaxonomyGroup1(final String healthcareProviderTaxonomyGroup1) {
        this.healthcareProviderTaxonomyGroup1 = healthcareProviderTaxonomyGroup1;
    }

    public String getHealthcareProviderTaxonomyGroup2() {
        return healthcareProviderTaxonomyGroup2;
    }

    public void setHealthcareProviderTaxonomyGroup2(final String healthcareProviderTaxonomyGroup2) {
        this.healthcareProviderTaxonomyGroup2 = healthcareProviderTaxonomyGroup2;
    }

    public String getHealthcareProviderTaxonomyGroup3() {
        return healthcareProviderTaxonomyGroup3;
    }

    public void setHealthcareProviderTaxonomyGroup3(final String healthcareProviderTaxonomyGroup3) {
        this.healthcareProviderTaxonomyGroup3 = healthcareProviderTaxonomyGroup3;
    }

    public String getHealthcareProviderTaxonomyGroup4() {
        return healthcareProviderTaxonomyGroup4;
    }

    public void setHealthcareProviderTaxonomyGroup4(final String healthcareProviderTaxonomyGroup4) {
        this.healthcareProviderTaxonomyGroup4 = healthcareProviderTaxonomyGroup4;
    }

    public String getHealthcareProviderTaxonomyGroup5() {
        return healthcareProviderTaxonomyGroup5;
    }

    public void setHealthcareProviderTaxonomyGroup5(final String healthcareProviderTaxonomyGroup5) {
        this.healthcareProviderTaxonomyGroup5 = healthcareProviderTaxonomyGroup5;
    }

    public String getHealthcareProviderTaxonomyGroup6() {
        return healthcareProviderTaxonomyGroup6;
    }

    public void setHealthcareProviderTaxonomyGroup6(final String healthcareProviderTaxonomyGroup6) {
        this.healthcareProviderTaxonomyGroup6 = healthcareProviderTaxonomyGroup6;
    }

    public String getHealthcareProviderTaxonomyGroup7() {
        return healthcareProviderTaxonomyGroup7;
    }

    public void setHealthcareProviderTaxonomyGroup7(final String healthcareProviderTaxonomyGroup7) {
        this.healthcareProviderTaxonomyGroup7 = healthcareProviderTaxonomyGroup7;
    }

    public String getHealthcareProviderTaxonomyGroup8() {
        return healthcareProviderTaxonomyGroup8;
    }

    public void setHealthcareProviderTaxonomyGroup8(final String healthcareProviderTaxonomyGroup8) {
        this.healthcareProviderTaxonomyGroup8 = healthcareProviderTaxonomyGroup8;
    }

    public String getHealthcareProviderTaxonomyGroup9() {
        return healthcareProviderTaxonomyGroup9;
    }

    public void setHealthcareProviderTaxonomyGroup9(final String healthcareProviderTaxonomyGroup9) {
        this.healthcareProviderTaxonomyGroup9 = healthcareProviderTaxonomyGroup9;
    }

    public String getHealthcareProviderTaxonomyGroup10() {
        return healthcareProviderTaxonomyGroup10;
    }

    public void setHealthcareProviderTaxonomyGroup10(final String healthcareProviderTaxonomyGroup10) {
        this.healthcareProviderTaxonomyGroup10 = healthcareProviderTaxonomyGroup10;
    }

    public String getHealthcareProviderTaxonomyGroup11() {
        return healthcareProviderTaxonomyGroup11;
    }

    public void setHealthcareProviderTaxonomyGroup11(final String healthcareProviderTaxonomyGroup11) {
        this.healthcareProviderTaxonomyGroup11 = healthcareProviderTaxonomyGroup11;
    }

    public String getHealthcareProviderTaxonomyGroup12() {
        return healthcareProviderTaxonomyGroup12;
    }

    public void setHealthcareProviderTaxonomyGroup12(final String healthcareProviderTaxonomyGroup12) {
        this.healthcareProviderTaxonomyGroup12 = healthcareProviderTaxonomyGroup12;
    }

    public String getHealthcareProviderTaxonomyGroup13() {
        return healthcareProviderTaxonomyGroup13;
    }

    public void setHealthcareProviderTaxonomyGroup13(final String healthcareProviderTaxonomyGroup13) {
        this.healthcareProviderTaxonomyGroup13 = healthcareProviderTaxonomyGroup13;
    }

    public String getHealthcareProviderTaxonomyGroup14() {
        return healthcareProviderTaxonomyGroup14;
    }

    public void setHealthcareProviderTaxonomyGroup14(final String healthcareProviderTaxonomyGroup14) {
        this.healthcareProviderTaxonomyGroup14 = healthcareProviderTaxonomyGroup14;
    }

    public String getHealthcareProviderTaxonomyGroup15() {
        return healthcareProviderTaxonomyGroup15;
    }

    public void setHealthcareProviderTaxonomyGroup15(final String healthcareProviderTaxonomyGroup15) {
        this.healthcareProviderTaxonomyGroup15 = healthcareProviderTaxonomyGroup15;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.npi);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nppes other = (Nppes) obj;

        return Objects.equals(this.npi, other.npi);
    }

}
