/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.service.resource.fund;

import com.adyen.Service;
import com.adyen.service.Resource;

/**
 * Created by rikt on 9/12/17.
 */
public class AccountHolderBalance extends Resource {

    public AccountHolderBalance(Service service) {
        super(service, service.getClient().getConfig().getMarketPayEndpoint() + "/Fund/" + service.getClient().getMarketPayApiVersion() + "/accountHolderBalance", null);
    }

}
