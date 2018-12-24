/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlar;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findByDb", query = "SELECT e FROM Event e WHERE e.eventPK.db = :db")
    , @NamedQuery(name = "Event.findByName", query = "SELECT e FROM Event e WHERE e.eventPK.name = :name")
    , @NamedQuery(name = "Event.findByDefiner", query = "SELECT e FROM Event e WHERE e.definer = :definer")
    , @NamedQuery(name = "Event.findByExecuteAt", query = "SELECT e FROM Event e WHERE e.executeAt = :executeAt")
    , @NamedQuery(name = "Event.findByIntervalValue", query = "SELECT e FROM Event e WHERE e.intervalValue = :intervalValue")
    , @NamedQuery(name = "Event.findByIntervalField", query = "SELECT e FROM Event e WHERE e.intervalField = :intervalField")
    , @NamedQuery(name = "Event.findByCreated", query = "SELECT e FROM Event e WHERE e.created = :created")
    , @NamedQuery(name = "Event.findByModified", query = "SELECT e FROM Event e WHERE e.modified = :modified")
    , @NamedQuery(name = "Event.findByLastExecuted", query = "SELECT e FROM Event e WHERE e.lastExecuted = :lastExecuted")
    , @NamedQuery(name = "Event.findByStarts", query = "SELECT e FROM Event e WHERE e.starts = :starts")
    , @NamedQuery(name = "Event.findByEnds", query = "SELECT e FROM Event e WHERE e.ends = :ends")
    , @NamedQuery(name = "Event.findByStatus", query = "SELECT e FROM Event e WHERE e.status = :status")
    , @NamedQuery(name = "Event.findByOnCompletion", query = "SELECT e FROM Event e WHERE e.onCompletion = :onCompletion")
    , @NamedQuery(name = "Event.findBySqlMode", query = "SELECT e FROM Event e WHERE e.sqlMode = :sqlMode")
    , @NamedQuery(name = "Event.findByComment", query = "SELECT e FROM Event e WHERE e.comment = :comment")
    , @NamedQuery(name = "Event.findByOriginator", query = "SELECT e FROM Event e WHERE e.originator = :originator")
    , @NamedQuery(name = "Event.findByTimeZone", query = "SELECT e FROM Event e WHERE e.timeZone = :timeZone")
    , @NamedQuery(name = "Event.findByCharacterSetClient", query = "SELECT e FROM Event e WHERE e.characterSetClient = :characterSetClient")
    , @NamedQuery(name = "Event.findByCollationConnection", query = "SELECT e FROM Event e WHERE e.collationConnection = :collationConnection")
    , @NamedQuery(name = "Event.findByDbCollation", query = "SELECT e FROM Event e WHERE e.dbCollation = :dbCollation")})
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EventPK eventPK;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "body")
    private byte[] body;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 77)
    @Column(name = "definer")
    private String definer;
    @Column(name = "execute_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date executeAt;
    @Column(name = "interval_value")
    private Integer intervalValue;
    @Size(max = 18)
    @Column(name = "interval_field")
    private String intervalField;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Column(name = "last_executed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastExecuted;
    @Column(name = "starts")
    @Temporal(TemporalType.TIMESTAMP)
    private Date starts;
    @Column(name = "ends")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ends;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "on_completion")
    private String onCompletion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 478)
    @Column(name = "sql_mode")
    private String sqlMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "originator")
    private int originator;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "time_zone")
    private String timeZone;
    @Size(max = 32)
    @Column(name = "character_set_client")
    private String characterSetClient;
    @Size(max = 32)
    @Column(name = "collation_connection")
    private String collationConnection;
    @Size(max = 32)
    @Column(name = "db_collation")
    private String dbCollation;
    @Lob
    @Column(name = "body_utf8")
    private byte[] bodyUtf8;

    public Event() {
    }

    public Event(EventPK eventPK) {
        this.eventPK = eventPK;
    }

    public Event(EventPK eventPK, byte[] body, String definer, Date created, Date modified, String status, String onCompletion, String sqlMode, String comment, int originator, String timeZone) {
        this.eventPK = eventPK;
        this.body = body;
        this.definer = definer;
        this.created = created;
        this.modified = modified;
        this.status = status;
        this.onCompletion = onCompletion;
        this.sqlMode = sqlMode;
        this.comment = comment;
        this.originator = originator;
        this.timeZone = timeZone;
    }

    public Event(String db, String name) {
        this.eventPK = new EventPK(db, name);
    }

    public EventPK getEventPK() {
        return eventPK;
    }

    public void setEventPK(EventPK eventPK) {
        this.eventPK = eventPK;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    public Date getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    public Integer getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    public String getIntervalField() {
        return intervalField;
    }

    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLastExecuted() {
        return lastExecuted;
    }

    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getEnds() {
        return ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnCompletion() {
        return onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    public String getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getOriginator() {
        return originator;
    }

    public void setOriginator(int originator) {
        this.originator = originator;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    public String getDbCollation() {
        return dbCollation;
    }

    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation;
    }

    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventPK != null ? eventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventPK == null && other.eventPK != null) || (this.eventPK != null && !this.eventPK.equals(other.eventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controlar.Event[ eventPK=" + eventPK + " ]";
    }
    
}
