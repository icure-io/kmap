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

package org.taktik.icure.entities

import org.taktik.icure.entities.base.StoredDocument
import org.taktik.icure.entities.embed.RevisionInfo
import org.taktik.icure.utils.DynamicInitializer
import org.taktik.icure.utils.invoke

data class CalendarItemType(
       override val id: String,
       override val rev: String? = null,
       override val deletionDate: Long? = null,
        val name: String? = null,
        val color: String? = null, //"#123456"
        val duration: Int = 0, // mikrono: int durationInMinutes; = 0
        val externalRef: String? = null, // same as topaz Id, to be used by mikrono
        val mikronoId: String? = null,
        val docIds: Set<String> = emptySet(),
        val otherInfos: Map<String, String> = emptyMap(),
        val subjectByLanguage: Map<String, String> = emptyMap(),
       override val revisionsInfo: List<RevisionInfo>? = emptyList(),
       override val conflicts: List<String>? = emptyList(),
       override val revHistory: Map<String, String>? = emptyMap()

) : StoredDocument {
    companion object : DynamicInitializer<CalendarItemType>

    fun merge(other: CalendarItemType) = CalendarItemType(args = this.solveConflictsWith(other))
    fun solveConflictsWith(other: CalendarItemType) = super.solveConflictsWith(other) + mapOf(
            "name" to (this.name ?: other.name),
            "color" to (this.color ?: other.color),
            "duration" to (this.duration.coerceAtLeast(other.duration)),
            "externalRef" to (this.externalRef ?: other.externalRef),
            "mikronoId" to (this.mikronoId ?: other.mikronoId),
            "docIds" to (other.docIds + this.docIds),
            "otherInfos" to (other.otherInfos + this.otherInfos),
            "subjectByLanguage" to (other.subjectByLanguage + this.subjectByLanguage)
    )

    override fun withIdRev(id: String?, rev: String) = if (id != null) this.copy(id = id, rev = rev) else this.copy(rev = rev)
    override fun withDeletionDate(deletionDate: Long?) = this.copy(deletionDate = deletionDate)
}
