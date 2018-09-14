/*
 * This file contains Original Code and/or Modifications of Original Code
 * as defined in and that are subject to the Apache License
 * Version 2.0 (the 'License'). You may not use this file except in
 * compliance with the License. Please obtain a copy of the License at
 * http://opensource.org/licenses/Apache-2.0/ and read it before using this
 * file.
 *
 * The Original Code and all software distributed under the License are
 * distributed on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER
 * EXPRESS OR IMPLIED, AND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES,
 * INCLUDING WITHOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, QUIET ENJOYMENT OR NON-INFRINGEMENT.
 * Please see the License for the specific language governing rights and
 * limitations under the License.
 */

package de.appplant.cordova.plugin.badge;

import android.content.Context;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static org.apache.cordova.PluginResult.Status.OK;

public class Badge extends CordovaPlugin {

    /**
     * Executes the request.
     *
     * @param action   The action to execute.
     * @param args     The exec() arguments.
     * @param callback The callback context used when
     *                 calling back into JavaScript.
     *
     * @return Returning false results in a "MethodNotFound" error.
     */
    @Override
    public boolean execute (String action, JSONArray args, CallbackContext callback)
            throws JSONException {

        boolean ret = true;
        
		setOreoBadge();
        
        return ret;
    }
	
	/**
     * Set the badge number.
     *
     * @param args     The number to set as the badge number.
     * @param callback The function to be exec as the callback.
     */
    private void setOreoBadge () {

        cordova.getThreadPool().execute(new Runnable() {
            @Override
            public void run() {
				
				OreoShortcutIconBadger osib = new OreoShortcutIconBadger();
            }
        });
    }


    /**
     * Returns the context of the activity.
     */
    private Context getContext () {
        return cordova.getActivity();
    }

}
