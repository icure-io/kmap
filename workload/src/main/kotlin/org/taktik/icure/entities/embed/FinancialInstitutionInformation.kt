/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */
package org.taktik.icure.entities.embed

import java.io.Serializable

data class FinancialInstitutionInformation(
        val name: String? = null,
        val key: String? = null,
        val bankAccount: String? = null,
        val bic: String? = null,
        val proxyBankAccount: String? = null,
        val proxyBic: String? = null,
        val preferredFiiForPartners: Set<String> = emptySet(), //Insurance Id, Hcp Id
        override val encryptedSelf: String? = null
) : Encrypted, Serializable
