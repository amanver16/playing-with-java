package com.aman.java.phonebook.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class PhoneBookService {

	private Logger logger = LogManager.getLogger(PhoneBookService.class);
	private Map<String, Integer> phoneHashMap = new ConcurrentHashMap<>();

	// Method to add phone records
	public boolean addPhoneRecordService(String name, int phoneNumber) {

		boolean isAdded = false;

		if (phoneHashMap.put(name, phoneNumber) == null) {
			isAdded = true;
		}

		return isAdded;
	}

	// Method to print phone records
	public void showPhoneRecordService() {

		Set<String> phoneKeys = phoneHashMap.keySet();

		for (String keyNames : phoneKeys)
			logger.info(keyNames + " " + phoneHashMap.get(keyNames));
	}

	// Method to delete phone records
	public boolean deletePhoneRecordService(String name) {

		if (phoneHashMap.isEmpty()) {
			return false;
		}

		Iterator<Map.Entry<String, Integer>> phoneBookMapIterator = phoneHashMap.entrySet().iterator();

		while (phoneBookMapIterator.hasNext()) {

			Map.Entry<String, Integer> entry = phoneBookMapIterator.next();

			if (entry.getKey().equalsIgnoreCase(name)) {

				phoneBookMapIterator.remove();
				return true;
			}
		}

		return false;
	}

	// Method to query phone records

	public boolean queryPhoneRecordService(String name) {

		if (phoneHashMap.isEmpty()) {
			return false;
		}

		Iterator<Map.Entry<String, Integer>> phoneBookMapIterator = phoneHashMap.entrySet().iterator();

		while (phoneBookMapIterator.hasNext()) {

			Map.Entry<String, Integer> entry = phoneBookMapIterator.next();

			if (entry.getKey().equalsIgnoreCase(name)) {

				logger.info(entry.getKey() + " " + entry.getValue());
				return true;
			}
		}

		return false;
	}
}
