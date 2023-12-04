/**
 * Copyright (C) 2012-2015 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.ds.hibernate.values;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.joda.time.DateTime;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java

import org.n52.iceland.ogc.ows.Extensions;
import org.n52.iceland.util.DateTimeHelper;
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
=======
import org.joda.time.DateTimeZone;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
import org.n52.sos.ds.hibernate.HibernateSessionHolder;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
import org.n52.sos.ds.hibernate.entities.AbstractObservationTime;
import org.n52.sos.ds.hibernate.entities.interfaces.SweDataArrayValue;
import org.n52.sos.ds.hibernate.entities.values.AbstractValue;
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
import org.n52.sos.ds.hibernate.entities.AbstractObservationTime;
import org.n52.sos.ds.hibernate.entities.interfaces.SweDataArrayValue;
import org.n52.sos.ds.hibernate.entities.values.AbstractValue;
import org.n52.sos.ogc.gml.time.Time;
import org.n52.sos.ogc.gml.time.TimeInstant;
=======
import org.n52.sos.ds.hibernate.entities.observation.AbstractTemporalReferencedObservation;
import org.n52.sos.ds.hibernate.entities.observation.BaseObservation;
import org.n52.sos.ds.hibernate.entities.observation.Observation;
import org.n52.sos.ds.hibernate.entities.observation.TemporalReferencedObservation;
import org.n52.sos.ds.hibernate.entities.observation.ValuedObservation;
import org.n52.sos.ds.hibernate.entities.observation.legacy.AbstractValuedLegacyObservation;
import org.n52.sos.ds.hibernate.entities.observation.legacy.valued.SweDataArrayValuedLegacyObservation;
import org.n52.sos.ds.hibernate.util.observation.ObservationValueCreator;
import org.n52.sos.ogc.gml.CodeWithAuthority;
import org.n52.sos.ogc.gml.ReferenceType;
import org.n52.sos.ogc.gml.time.Time;
import org.n52.sos.ogc.gml.time.TimeInstant;
import org.n52.sos.ogc.gml.time.TimePeriod;
import org.n52.sos.ogc.om.NamedValue;
import org.n52.sos.ogc.om.OmConstants;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
import org.n52.sos.ogc.om.OmObservation;
import org.n52.sos.ogc.om.SingleObservationValue;
import org.n52.sos.ogc.om.StreamingValue;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
import org.n52.sos.ogc.ows.OwsExceptionReport;
import org.n52.sos.ogc.swes.SwesExtensions;
=======
import org.n52.sos.ogc.om.TimeValuePair;
import org.n52.sos.ogc.om.values.Value;
import org.n52.sos.ogc.ows.OwsExceptionReport;
import org.n52.sos.ogc.swes.SwesExtensions;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
import org.n52.sos.request.GetObservationRequest;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
import org.n52.sos.util.DateTimeHelper;
=======
import org.n52.sos.util.DateTimeHelper;
import org.n52.sos.util.GeometryHandler;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
import org.n52.sos.util.GmlHelper;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java

||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
=======
import org.n52.sos.util.OMHelper;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.n52.iceland.ds.ConnectionProvider;
import org.n52.iceland.exception.ows.OwsExceptionReport;
import org.n52.iceland.ogc.gml.time.Time;
import org.n52.iceland.ogc.gml.time.TimeInstant;

import com.google.common.collect.Maps;
import com.vividsolutions.jts.geom.Geometry;

/**
 * Abstract class for Hibernate streaming values
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
 * 
 * @author Carsten Hollmann <c.hollmann@52north.org>
=======
 *
 * @author Carsten Hollmann <c.hollmann@52north.org>
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
 * @since 4.1.0
 *
 */
public abstract class AbstractHibernateStreamingValue extends StreamingValue<AbstractValuedLegacyObservation<?>> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractHibernateStreamingValue.class);

    private static final long serialVersionUID = -8355955808723620476L;

    protected final HibernateSessionHolder sessionHolder;

    protected Session session;

    protected final GetObservationRequest request;

    protected Criterion temporalFilterCriterion;

    /**
     * constructor
     *
     * @param request
     *            {@link GetObservationRequest}
     * @param connectionProvider the connection provider
     */
    public AbstractHibernateStreamingValue(ConnectionProvider connectionProvider, GetObservationRequest request) {
        this.request = request;
        this.sessionHolder = new HibernateSessionHolder(connectionProvider);
    }

    @Override
    public Collection<OmObservation> mergeObservation() throws OwsExceptionReport {

        Map<String, OmObservation> observations = Maps.newHashMap();
        while (hasNextValue()) {
            AbstractValuedLegacyObservation<?> nextEntity = nextEntity();
            boolean mergableObservationValue = checkForMergability(nextEntity);
            OmObservation observation = null;
            if (observations.containsKey(nextEntity.getDiscriminator()) && mergableObservationValue) {
                observation = observations.get(nextEntity.getDiscriminator());
            } else {
                observation = observationTemplate.cloneTemplate();
                addSpecificValuesToObservation(observation, nextEntity, request.getExtensions());
                if (!mergableObservationValue && nextEntity.getDiscriminator() == null) {
                    observations.put(Long.toString(nextEntity.getObservationId()), observation);
                } else {
                    observations.put(nextEntity.getDiscriminator(), observation);
                }
            }
            nextEntity.mergeValueToObservation(observation, getResponseFormat());
            sessionHolder.getSession().evict(nextEntity);
        }
        return observations.values();
    }

<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java


    private boolean checkForMergability(AbstractValue nextEntity) {
        return !(nextEntity instanceof SweDataArrayValue);
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
    private boolean checkForMergability(AbstractValue nextEntity) {
        return !(nextEntity instanceof SweDataArrayValue);
=======
    private boolean checkForMergability(AbstractValuedLegacyObservation<?> nextEntity) {
        return !(nextEntity instanceof SweDataArrayValuedLegacyObservation);
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
    }

<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
    private void addSpecificValuesToObservation(OmObservation observation, AbstractValue value, Extensions extensions) {
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
    private void addSpecificValuesToObservation(OmObservation observation, AbstractValue value,
            SwesExtensions swesExtensions) {
=======
    private void addSpecificValuesToObservation(OmObservation observation, AbstractValuedLegacyObservation<?> value,
            SwesExtensions swesExtensions) {
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
        boolean newSession = false;
        try {
            if (session == null) {
                session = sessionHolder.getSession();
                newSession = true;
            }
            value.addValueSpecificDataToObservation(observation, session, extensions);
        } catch (OwsExceptionReport owse) {
            LOGGER.error("Error while querying times", owse);
        } finally {
            if (newSession) {
                sessionHolder.returnSession(session);
            }
        }
    }

    /**
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
     * constructor
     * 
     * @param request
     *            {@link GetObservationRequest}
     */
    public AbstractHibernateStreamingValue(GetObservationRequest request) {
        this.request = request;
    }

    /**
=======
     * constructor
     *
     * @param request
     *            {@link GetObservationRequest}
     */
    public AbstractHibernateStreamingValue(GetObservationRequest request) {
        this.request = request;
    }

    /**
     * Set the observation template which contains all metadata
     *
     * @param observationTemplate
     *            Observation template to set
     */
    public void setObservationTemplate(OmObservation observationTemplate) {
        this.observationTemplate = observationTemplate;
    }

    /**
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
     * Set the temporal filter {@link Criterion}
     *
     * @param temporalFilterCriterion
     *            Temporal filter {@link Criterion}
     */
    public void setTemporalFilterCriterion(Criterion temporalFilterCriterion) {
        this.temporalFilterCriterion = temporalFilterCriterion;

    }

    /**
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
     * Get the observation ids from {@link AbstractValue}s
     *
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
     * Get the observation ids from {@link AbstractValue}s
     * 
=======
     * Create a {@link TimeValuePair} from {@link AbstractValuedLegacyObservation}
     *
     * @param abstractValue
     *            {@link AbstractValuedLegacyObservation} to create {@link TimeValuePair} from
     * @return resulting {@link TimeValuePair}
     * @throws OwsExceptionReport
     *             If an error occurs when getting the value
     */
    protected TimeValuePair createTimeValuePairFrom(ValuedObservation<?> abstractValue) throws OwsExceptionReport {
        return new TimeValuePair(createPhenomenonTime(abstractValue), abstractValue.accept(new ObservationValueCreator()));
    }

    /**
     * Add {@link AbstractValuedLegacyObservation} data to {@link OmObservation}
     *
     * @param observation
     *            {@link OmObservation} to add data
     * @param abstractValue
     *            {@link AbstractValuedLegacyObservation} to get data from
     * @throws OwsExceptionReport
     *             If an error occurs when getting the value
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected void addValuesToObservation(OmObservation observation, ValuedObservation<?> abstractValue)
            throws OwsExceptionReport {
        observation.setObservationID(Long.toString(abstractValue.getObservationId()));
        if (abstractValue.isSetIdentifier()) {
            CodeWithAuthority identifier = new CodeWithAuthority(abstractValue.getIdentifier());
            if (abstractValue.isSetCodespace()) {
                identifier.setCodeSpace(abstractValue.getCodespace().getCodespace());
            }
            observation.setIdentifier(identifier);
        }
        if (abstractValue.isSetDescription()) {
            observation.setDescription(abstractValue.getDescription());
        }
        Value<?> value = abstractValue.accept(new ObservationValueCreator());
        if (!observation.getObservationConstellation().isSetObservationType()) {
            observation.getObservationConstellation().setObservationType(OMHelper.getObservationTypeFor(value));
        }
        observation.setResultTime(createResutlTime(abstractValue.getResultTime()));
        observation.setValidTime(createValidTime(abstractValue.getValidTimeStart(), abstractValue.getValidTimeEnd()));
        observation.setValue(new SingleObservationValue(createPhenomenonTime(abstractValue), value));
    }

    /**
     * Get the observation ids from {@link AbstractValuedLegacyObservation}s
     *
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
     * @param abstractValuesResult
     *            {@link AbstractValuedLegacyObservation}s to get ids from
     * @return Set with ids
     */
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
    protected Set<Long> getObservationIds(Collection<AbstractValue> abstractValuesResult) {
        Set<Long> ids = new HashSet<>();
        for (AbstractValue abstractValue : abstractValuesResult) {
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
    protected Set<Long> getObservationIds(Collection<AbstractValue> abstractValuesResult) {
        Set<Long> ids = new HashSet<Long>();
        for (AbstractValue abstractValue : abstractValuesResult) {
=======
    protected Set<Long> getObservationIds(Collection<? extends BaseObservation> abstractValuesResult) {
        Set<Long> ids = new HashSet<>(abstractValuesResult.size());
        for (BaseObservation abstractValue : abstractValuesResult) {
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
            ids.add(abstractValue.getObservationId());
        }
        return ids;
    }

    /**
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
     * Create phenomenon time from min and max {@link AbstractObservationTime}s
     *
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
     * Create phenomenon time from min and max {@link AbstractObservationTime}s
     * 
=======
     * Create the phenomenon time from {@link AbstractValuedLegacyObservation}
     *
     * @param abstractValue
     *            {@link AbstractValuedLegacyObservation} for get time from
     * @return phenomenon time
     */
    protected Time createPhenomenonTime(TemporalReferencedObservation abstractValue) {
        // create time element
        final DateTime phenStartTime = new DateTime(abstractValue.getPhenomenonTimeStart(), DateTimeZone.UTC);
        DateTime phenEndTime;
        if (abstractValue.getPhenomenonTimeEnd() != null) {
            phenEndTime = new DateTime(abstractValue.getPhenomenonTimeEnd(), DateTimeZone.UTC);
        } else {
            phenEndTime = phenStartTime;
        }
        return createTime(phenStartTime, phenEndTime);
    }

    /**
     * Create phenomenon time from min and max {@link AbstractTemporalReferencedObservation}s
     *
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
     * @param minTime
     *            minimum {@link AbstractTemporalReferencedObservation}
     * @param maxTime
     *            maximum {@link AbstractTemporalReferencedObservation}
     * @return phenomenon time
     */
    protected Time createPhenomenonTime(TemporalReferencedObservation minTime, TemporalReferencedObservation maxTime) {
        // create time element

        final DateTime phenStartTime = DateTimeHelper.makeDateTime(minTime.getPhenomenonTimeStart());
        DateTime phenEndTime;
        if (maxTime.getPhenomenonTimeEnd() != null) {
            phenEndTime = DateTimeHelper.makeDateTime(minTime.getPhenomenonTimeEnd());
        } else {
            phenEndTime = phenStartTime;
        }
        return GmlHelper.createTime(phenStartTime, phenEndTime);
    }

    /**
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
     * Create result time from {@link AbstractObservationTime}
     *
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
     * Create result time from {@link AbstractObservationTime}
     * 
=======
     * Create result time from {@link AbstractTemporalReferencedObservation}
     *
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
     * @param maxTime
     *            {@link AbstractTemporalReferencedObservation} to create result time from
     * @return result time
     */
    protected TimeInstant createResutlTime(TemporalReferencedObservation maxTime) {
        DateTime dateTime = DateTimeHelper.makeDateTime(maxTime.getResultTime());
        return new TimeInstant(dateTime);
    }

    /**
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/eebe2178-4624-45cb-b176-6a8ad5e79e45.java
     * Create valid time from min and max {@link AbstractObservationTime}s
     *
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/75323908-5f67-466f-b747-6cf4f1fc0e0b.java
     * Create valid time from min and max {@link AbstractObservationTime}s
     * 
=======
     * Create result time from {@link Date}
     *
     * @param date
     *            {@link Date} to create result time from
     * @return result time
     */
    protected TimeInstant createResutlTime(Date date) {
        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        return new TimeInstant(dateTime);
    }

    /**
     * Create valid time from min and max {@link AbstractTemporalReferencedObservation}s
     *
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/5a989787-5176-408b-b557-3f290798432f.java
     * @param minTime
     *            minimum {@link AbstractTemporalReferencedObservation}
     * @param maxTime
     *            maximum {@link AbstractTemporalReferencedObservation}
     * @return valid time or null if valid time is not set in datasource
     */
    protected Time createValidTime(TemporalReferencedObservation minTime, TemporalReferencedObservation maxTime) {
        // create time element
        if (minTime.getValidTimeStart() != null && maxTime.getValidTimeEnd() != null) {
            final DateTime startTime = DateTimeHelper.makeDateTime(minTime.getValidTimeStart());
            DateTime endTime = DateTimeHelper.makeDateTime(minTime.getValidTimeEnd());
            return GmlHelper.createTime(startTime, endTime);
        }
        return null;
    }

    /**
     * Create {@link TimePeriod} from {@link Date}s
     *
     * @param start
     *            Start {@link Date}
     * @param end
     *            End {@link Date}
     * @return {@link TimePeriod} or null if {@link Date}s are null
     */
    protected TimePeriod createValidTime(Date start, Date end) {
        // create time element
        if (start != null && end != null) {
            final DateTime startTime = new DateTime(start, DateTimeZone.UTC);
            DateTime endTime = new DateTime(end, DateTimeZone.UTC);
            return new TimePeriod(startTime, endTime);
        }
        return null;
    }

    /**
     * Create {@link Time} from {@link DateTime}s
     *
     * @param start
     *            Start {@link DateTime}
     * @param end
     *            End {@link DateTime}
     * @return Resulting {@link Time}
     */
    protected Time createTime(DateTime start, DateTime end) {
        if (start.equals(end)) {
            return new TimeInstant(start);
        } else {
            return new TimePeriod(start, end);
        }
    }

    /**
     * Get internal {@link Value} from {@link AbstractValuedLegacyObservation}
     *
     * @param abstractValue
     *            {@link AbstractValuedLegacyObservation} to get {@link Value} from
     * @return {@link Value} or null if the concrete {@link AbstractValuedLegacyObservation} is
     *         not supported
     * @throws OwsExceptionReport
     *             If an error occurs when creating
     *             {@link org.n52.sos.ogc.om.values.SweDataArrayValue}
     *             
     * User {@link Observation#accept(org.n52.sos.ds.hibernate.entities.observation.ObservationVisitor)}
     */
    @Deprecated
    protected Value<?> getValueFrom(ValuedObservation<?> abstractValue) throws OwsExceptionReport {
        Value<?> value = abstractValue.accept(new ObservationValueCreator());
//        if (value != null && abstractValue.isSetUnit()) {
//            value.setUnit(abstractValue.getUnit().getUnit());
//        }
        return value;
    }

    protected NamedValue<?> createSpatialFilteringProfileParameter(Geometry samplingGeometry)
            throws OwsExceptionReport {
        final NamedValue<Geometry> namedValue = new NamedValue<>();
        final ReferenceType referenceType = new ReferenceType(OmConstants.PARAM_NAME_SAMPLING_GEOMETRY);
        namedValue.setName(referenceType);
        // TODO add lat/long version
        Geometry geometry = samplingGeometry;
        namedValue.setValue(new org.n52.sos.ogc.om.values.GeometryValue(GeometryHandler.getInstance()
                .switchCoordinateAxisFromToDatasourceIfNeeded(geometry)));
        return namedValue;
    }

}