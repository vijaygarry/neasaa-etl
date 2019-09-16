/*
 * Copyright 2019 neasaa.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.neasaa.etl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is main application class (entry point) for ETL Tool. 
 * 
 * @author Nitesh
 * 
 * @version 1.0 2019-09-10
 *
 */
public class ETLTool {

	private static final Logger logger = LoggerFactory.getLogger(ETLTool.class);
	private static final Logger ERROR_REPORT = LoggerFactory.getLogger("ERROR_REPORT");

	public static void main(String[] args) {
		logger.debug("Starting tool at " + new Date());
		System.out.println("Welcome to Neasaa ETL Tool");
		logger.info("Running ETL Tool");
		logger.error("Some error in running the tool.", new Exception("Exception running the tool"));
		ERROR_REPORT.info("Error report sample");
	}
}