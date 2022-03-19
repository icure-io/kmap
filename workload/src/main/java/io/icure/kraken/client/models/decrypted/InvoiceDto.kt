/**
 * iCure Data Stack API Documentation
 *
 * The iCure Data Stack Application API is the native interface to iCure.
 *
 * The version of the OpenAPI document: v2
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
package io.icure.kraken.client.models.decrypted

import io.icure.kraken.client.models.CodeStubDto
import io.icure.kraken.client.models.DelegationDto
import io.icure.kraken.client.models.IdentityDocumentReaderDto
import io.icure.kraken.client.models.InvoicingCodeDto
import io.icure.kraken.client.models.PaymentDto



/**
 * This entity is a root level object. It represents an Invoice. It is serialized in JSON and saved in the underlying iCure CouchDB database.
 *
 * @param id The Id of the Invoice. We encourage using either a v4 UUID or a HL7 Id.
 * @param tags A tag is an item from a codification system that qualifies an entity as being member of a certain class, whatever the value it might have taken. If the tag qualifies the content of a field, it means that whatever the content of the field, the tag will always apply. For example, the label of a field is qualified using a tag. LOINC is a codification system typically used for tags.
 * @param codes A code is an item from a codification system that qualifies the content of this entity. SNOMED-CT, ICPC-2 or ICD-10 codifications systems can be used for codes
 * @param invoicingCodes
 * @param receipts
 * @param options
 * @param secretForeignKeys The secretForeignKeys are filled at the to many end of a one to many relationship (for example inside Contact for the Patient -> Contacts relationship). Used when we want to find all contacts for a specific patient. These keys are in clear. You can have several to partition the medical document space.
 * @param cryptedForeignKeys The secretForeignKeys are filled at the to many end of a one to many relationship (for example inside Contact for the Patient -> Contacts relationship). Used when we want to find the patient for a specific contact. These keys are the encrypted id (using the hcParty key for the delegate) that can be found in clear inside the patient. ids encrypted using the hcParty keys.
 * @param delegations When a document is created, the responsible generates a cryptographically random master key (never to be used for something else than referencing from other entities). He/she encrypts it using his own AES exchange key and stores it as a delegation. The responsible is thus always in the delegations as well
 * @param encryptionKeys When a document needs to be encrypted, the responsible generates a cryptographically random master key (different from the delegation key, never to appear in clear anywhere in the db. He/she encrypts it using his own AES exchange key and stores it as a delegation
 * @param rev The revision of the invoice in the database, used for conflict management / optimistic locking.
 * @param created The timestamp (unix epoch in ms) of creation of this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param modified The date (unix epoch in ms) of the latest modification of this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param author The id of the User that has created this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param responsible The id of the HealthcareParty that is responsible for this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param medicalLocationId The id of the medical location where this entity was created.
 * @param endOfLife Soft delete (unix epoch in ms) timestamp of the object.
 * @param deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called.
 * @param invoiceDate The timestamp (unix epoch in ms) when the invoice was drafted, will be filled automatically if missing. Not enforced by the application server.
 * @param sentDate The timestamp (unix epoch in ms) when the invoice was sent, will be filled automatically if missing. Not enforced by the application server.
 * @param printedDate The timestamp (unix epoch in ms) when the invoice is printed, will be filled automatically if missing. Not enforced by the application server.
 * @param recipientType The type of user that receives the invoice, a patient or a healthcare party
 * @param recipientId Id of the recipient of the invoice. For healthcare party and insurance, patient link happens through secretForeignKeys
 * @param invoiceReference
 * @param thirdPartyReference
 * @param thirdPartyPaymentJustification
 * @param thirdPartyPaymentReason
 * @param reason
 * @param invoiceType The format the invoice should follow based on the recipient which could be a patient, mutual fund or paying agency such as the CPAS
 * @param sentMediumType Medium of the invoice: CD ROM, Email, paper, etc.
 * @param interventionType
 * @param groupId
 * @param paymentType Type of payment, ex: cash, wired, insurance, debit card, etc.
 * @param paid
 * @param payments
 * @param gnotionNihii
 * @param gnotionSsin
 * @param gnotionLastName
 * @param gnotionFirstName
 * @param gnotionCdHcParty
 * @param invoicePeriod
 * @param careProviderType
 * @param internshipNihii
 * @param internshipSsin
 * @param internshipLastName
 * @param internshipFirstName
 * @param internshipCdHcParty
 * @param internshipCbe
 * @param supervisorNihii
 * @param supervisorSsin
 * @param supervisorLastName
 * @param supervisorFirstName
 * @param supervisorCdHcParty
 * @param supervisorCbe
 * @param error
 * @param encounterLocationName
 * @param encounterLocationNihii
 * @param encounterLocationNorm
 * @param longDelayJustification
 * @param correctiveInvoiceId
 * @param correctedInvoiceId
 * @param creditNote
 * @param creditNoteRelatedInvoiceId
 * @param idDocument
 * @param cancelReason
 * @param cancelDate
 * @param encryptedSelf The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys.
 */

data class InvoiceDto (

    /* The Id of the Invoice. We encourage using either a v4 UUID or a HL7 Id. */

    val id: kotlin.String,

    /* A tag is an item from a codification system that qualifies an entity as being member of a certain class, whatever the value it might have taken. If the tag qualifies the content of a field, it means that whatever the content of the field, the tag will always apply. For example, the label of a field is qualified using a tag. LOINC is a codification system typically used for tags. */

    val tags: kotlin.collections.List<CodeStubDto> = emptyList(),

    /* A code is an item from a codification system that qualifies the content of this entity. SNOMED-CT, ICPC-2 or ICD-10 codifications systems can be used for codes */

    val codes: kotlin.collections.List<CodeStubDto> = emptyList(),


    val invoicingCodes: kotlin.collections.List<InvoicingCodeDto> = emptyList(),


    val receipts: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),


    val options: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),

    /* The secretForeignKeys are filled at the to many end of a one to many relationship (for example inside Contact for the Patient -> Contacts relationship). Used when we want to find all contacts for a specific patient. These keys are in clear. You can have several to partition the medical document space. */

    val secretForeignKeys: kotlin.collections.List<kotlin.String> = emptyList(),

    /* The secretForeignKeys are filled at the to many end of a one to many relationship (for example inside Contact for the Patient -> Contacts relationship). Used when we want to find the patient for a specific contact. These keys are the encrypted id (using the hcParty key for the delegate) that can be found in clear inside the patient. ids encrypted using the hcParty keys. */

    val cryptedForeignKeys: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* When a document is created, the responsible generates a cryptographically random master key (never to be used for something else than referencing from other entities). He/she encrypts it using his own AES exchange key and stores it as a delegation. The responsible is thus always in the delegations as well */

    val delegations: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* When a document needs to be encrypted, the responsible generates a cryptographically random master key (different from the delegation key, never to appear in clear anywhere in the db. He/she encrypts it using his own AES exchange key and stores it as a delegation */

    val encryptionKeys: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* The revision of the invoice in the database, used for conflict management / optimistic locking. */

    val rev: kotlin.String? = null,

    /* The timestamp (unix epoch in ms) of creation of this entity, will be filled automatically if missing. Not enforced by the application server. */

    val created: kotlin.Long? = null,

    /* The date (unix epoch in ms) of the latest modification of this entity, will be filled automatically if missing. Not enforced by the application server. */

    val modified: kotlin.Long? = null,

    /* The id of the User that has created this entity, will be filled automatically if missing. Not enforced by the application server. */

    val author: kotlin.String? = null,

    /* The id of the HealthcareParty that is responsible for this entity, will be filled automatically if missing. Not enforced by the application server. */

    val responsible: kotlin.String? = null,

    /* The id of the medical location where this entity was created. */

    val medicalLocationId: kotlin.String? = null,

    /* Soft delete (unix epoch in ms) timestamp of the object. */

    val endOfLife: kotlin.Long? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,

    /* The timestamp (unix epoch in ms) when the invoice was drafted, will be filled automatically if missing. Not enforced by the application server. */

    val invoiceDate: kotlin.Long? = null,

    /* The timestamp (unix epoch in ms) when the invoice was sent, will be filled automatically if missing. Not enforced by the application server. */

    val sentDate: kotlin.Long? = null,

    /* The timestamp (unix epoch in ms) when the invoice is printed, will be filled automatically if missing. Not enforced by the application server. */

    val printedDate: kotlin.Long? = null,

    /* The type of user that receives the invoice, a patient or a healthcare party */

    val recipientType: kotlin.String? = null,

    /* Id of the recipient of the invoice. For healthcare party and insurance, patient link happens through secretForeignKeys */

    val recipientId: kotlin.String? = null,


    val invoiceReference: kotlin.String? = null,


    val thirdPartyReference: kotlin.String? = null,


    val thirdPartyPaymentJustification: kotlin.String? = null,


    val thirdPartyPaymentReason: kotlin.String? = null,


    val reason: kotlin.String? = null,

    /* The format the invoice should follow based on the recipient which could be a patient, mutual fund or paying agency such as the CPAS */

    val invoiceType: InvoiceDto.InvoiceType? = null,

    /* Medium of the invoice: CD ROM, Email, paper, etc. */

    val sentMediumType: InvoiceDto.SentMediumType? = null,


    val interventionType: InvoiceDto.InterventionType? = null,


    val groupId: kotlin.String? = null,

    /* Type of payment, ex: cash, wired, insurance, debit card, etc. */

    val paymentType: InvoiceDto.PaymentType? = null,


    val paid: kotlin.Double? = null,


    val payments: kotlin.collections.List<PaymentDto>? = null,


    val gnotionNihii: kotlin.String? = null,


    val gnotionSsin: kotlin.String? = null,


    val gnotionLastName: kotlin.String? = null,


    val gnotionFirstName: kotlin.String? = null,


    val gnotionCdHcParty: kotlin.String? = null,


    val invoicePeriod: kotlin.Int? = null,


    val careProviderType: kotlin.String? = null,


    val internshipNihii: kotlin.String? = null,


    val internshipSsin: kotlin.String? = null,


    val internshipLastName: kotlin.String? = null,


    val internshipFirstName: kotlin.String? = null,


    val internshipCdHcParty: kotlin.String? = null,


    val internshipCbe: kotlin.String? = null,


    val supervisorNihii: kotlin.String? = null,


    val supervisorSsin: kotlin.String? = null,


    val supervisorLastName: kotlin.String? = null,


    val supervisorFirstName: kotlin.String? = null,


    val supervisorCdHcParty: kotlin.String? = null,


    val supervisorCbe: kotlin.String? = null,


    val error: kotlin.String? = null,


    val encounterLocationName: kotlin.String? = null,


    val encounterLocationNihii: kotlin.String? = null,


    val encounterLocationNorm: kotlin.Int? = null,


    val longDelayJustification: kotlin.Int? = null,


    val correctiveInvoiceId: kotlin.String? = null,


    val correctedInvoiceId: kotlin.String? = null,


    val creditNote: kotlin.Boolean? = null,


    val creditNoteRelatedInvoiceId: kotlin.String? = null,


    val idDocument: IdentityDocumentReaderDto? = null,


    val cancelReason: kotlin.String? = null,


    val cancelDate: kotlin.Long? = null,

    /* The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys. */

    val encryptedSelf: kotlin.String? = null

) {

    /**
     * The format the invoice should follow based on the recipient which could be a patient, mutual fund or paying agency such as the CPAS
     *
     * Values: patient,mutualfund,payingagency,insurance,efact,other
     */
    enum class InvoiceType(val value: kotlin.String) {
        patient("patient"),
        mutualfund("mutualfund"),
        payingagency("payingagency"),
        insurance("insurance"),
        efact("efact"),
        other("other");
    }
    /**
     * Medium of the invoice: CD ROM, Email, paper, etc.
     *
     * Values: cdrom,eattest,efact,email,mediprima,paper,stat
     */
    enum class SentMediumType(val value: kotlin.String) {
        cdrom("cdrom"),
        eattest("eattest"),
        efact("efact"),
        email("email"),
        mediprima("mediprima"),
        paper("paper"),
        stat("stat");
    }
    /**
     *
     *
     * Values: total,userfees
     */
    enum class InterventionType(val value: kotlin.String) {
        total("total"),
        userfees("userfees");
    }
    /**
     * Type of payment, ex: cash, wired, insurance, debit card, etc.
     *
     * Values: cash,wired,insurance,creditcard,debitcard,paypal,bitcoin,other
     */
    enum class PaymentType(val value: kotlin.String) {
        cash("cash"),
        wired("wired"),
        insurance("insurance"),
        creditcard("creditcard"),
        debitcard("debitcard"),
        paypal("paypal"),
        bitcoin("bitcoin"),
        other("other");
    }
}

