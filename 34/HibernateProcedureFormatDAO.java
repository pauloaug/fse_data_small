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
package org.n52.sos.ds.hibernate.admin;

import java.util.Map;

import javax.inject.Inject;

import org.hibernate.Session;
<<<<<<< /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/9718f68d-9aa0-432e-8a37-18ccc46bed1b.java

import org.n52.iceland.ds.ConnectionProvider;
import org.n52.iceland.ogc.ows.OwsExceptionReport;
||||||| /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/bdef4199-713d-40f1-84ed-c9fc436ec4dc.java
import org.n52.iceland.ogc.ows.OwsExceptionReport;
=======
import org.n52.iceland.exception.ows.OwsExceptionReport;
>>>>>>> /mnt/batch/tasks/workitems/adfv2-General_1/job-1/d16d938a-0cde-4858-9b19-5a9eab00ddd9/wd/.temp/athenacommon/21f1ba7d-3cb2-4cbd-b64e-63088489efdd.java
import org.n52.sos.ds.ProcedureFormatDAO;
import org.n52.sos.ds.hibernate.HibernateSessionHolder;
import org.n52.sos.ds.hibernate.dao.ProcedureDAO;

/**
 * @author <a href="mailto:shane@axiomalaska.com">Shane StClair</a>
 */
public class HibernateProcedureFormatDAO implements ProcedureFormatDAO {

    private HibernateSessionHolder sessionHolder;

    @Inject
    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.sessionHolder = new HibernateSessionHolder(connectionProvider);
    }

    @Override
    public Map<String, String> getProcedureFormatMap() throws OwsExceptionReport {
        Session session = null;
        Map<String,String> procedureFormatMap = null;
        try {
            session = this.sessionHolder.getSession();
            procedureFormatMap = new ProcedureDAO().getProcedureFormatMap(session);
        } finally {
            this.sessionHolder.returnSession(session);
        }
        return procedureFormatMap;
    }
}