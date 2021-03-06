/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.conf;

public class Constants {
  /* Constants for LLAP */
  public static final String LLAP_LOGGER_NAME_QUERY_ROUTING = "query-routing";
  public static final String LLAP_LOGGER_NAME_CONSOLE = "console";
  public static final String LLAP_LOGGER_NAME_RFA = "RFA";

  /* Constants for Druid storage handler */
  public static final String DRUID_HIVE_STORAGE_HANDLER_ID =
          "org.apache.hadoop.hive.druid.DruidStorageHandler";
  public static final String DRUID_DATA_SOURCE = "druid.datasource";
  public static final String DRUID_QUERY_JSON = "druid.query.json";
  public static final String DRUID_QUERY_TYPE = "druid.query.type";
  public static final String DRUID_QUERY_FETCH = "druid.query.fetch";

  public static final String HIVE_SERVER2_JOB_CREDSTORE_PASSWORD_ENVVAR = "HIVE_JOB_CREDSTORE_PASSWORD";
  public static final String HADOOP_CREDENTIAL_PASSWORD_ENVVAR = "HADOOP_CREDSTORE_PASSWORD";
  public static final String HADOOP_CREDENTIAL_PROVIDER_PATH_CONFIG = "hadoop.security.credential.provider.path";
}
