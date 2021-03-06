/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2006 - 2008 Pentaho Corporation.  All rights reserved.
 *
 * Created July 18, 2008
 * @author mdamour
 */
package org.pentaho.platform.api.usersettings;

import java.util.List;

import org.pentaho.platform.api.engine.IPentahoInitializer;
import org.pentaho.platform.api.usersettings.pojo.IUserSetting;

public interface IUserSettingService extends IPentahoInitializer {
  public void deleteUserSettings();

  // if a global setting exists, the user setting has priority
  public List<IUserSetting> getUserSettings();
  public IUserSetting getUserSetting(String settingName, String defaultValue);
  public void setUserSetting(String settingName, String settingValue);
  
  // the implementation should allow only an administrator to set global user settings
  public List<IUserSetting> getGlobalUserSettings();
  public IUserSetting getGlobalUserSetting(String settingName, String defaultValue);
  public void setGlobalUserSetting(String settingName, String settingValue);
}
