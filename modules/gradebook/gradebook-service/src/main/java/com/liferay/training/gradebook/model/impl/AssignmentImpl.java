/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.gradebook.model.impl;

import com.liferay.portal.kernel.exception.LocaleException;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The extended model implementation for the Assignment service. Represents a row in the &quot;gradebook_Assignment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.gradebook.model.Assignment</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class AssignmentImpl extends AssignmentBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a assignment model instance should use the {@link com.liferay.training.gradebook.model.Assignment} interface instead.
	 */
	public AssignmentImpl() {
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStatus(int status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getStatusByUserId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStatusByUserUuid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStatusByUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getStatusDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle(Locale locale, boolean useDefault) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle(String languageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle(String languageId, boolean useDefault) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitleCurrentLanguageId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitleCurrentValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Locale, String> getTitleMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle(String title, Locale locale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(String title, Locale locale, Locale defaultLocale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(Locale locale, boolean useDefault) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(String languageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(String languageId, boolean useDefault) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescriptionCurrentValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Locale, String> getDescriptionMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description, Locale locale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(String description, Locale locale, Locale defaultLocale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap, Locale defaultLocale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isApproved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDenied() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDraft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInactive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIncomplete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPending() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isScheduled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getAvailableLanguageIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDefaultLanguageId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale) throws LocaleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toXmlString() {
		// TODO Auto-generated method stub
		return null;
	}

}