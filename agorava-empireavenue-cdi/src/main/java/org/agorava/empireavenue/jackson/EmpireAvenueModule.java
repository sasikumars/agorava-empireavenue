/*
 * Copyright 2013 Agorava.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.empireavenue.jackson;

import org.agorava.empireavenue.model.*;

import com.fasterxml.jackson.databind.module.SimpleModule;

import org.agorava.empireavenue.model.Status;
import org.agorava.empireavenue.response.*;

@SuppressWarnings("serial")
public class EmpireAvenueModule extends SimpleModule {

    public EmpireAvenueModule() {
        super("EmpireAvenueModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(Meta.class, MetaMixin.class);

        context.setMixInAnnotations(ProfileInfo.class, ProfileInfoMixin.class);
        context.setMixInAnnotations(Status.class, StatusMixin.class);
        context.setMixInAnnotations(Community.class, CommunityMixin.class);

        context.setMixInAnnotations(StatusResponse.class, StatusResponseMixin.class);

        context.setMixInAnnotations(ProfileInfoResponse.class, ProfileInfoResponseMixin.class);
        context.setMixInAnnotations(CommunityResponse.class, CommunityResponseMixin.class);
        
        context.setMixInAnnotations(Count.class,CountMixin.class);
        context.setMixInAnnotations(CountResponse.class,CountResponseMixin.class);
        
        context.setMixInAnnotations(BankBalance.class,BankBalanceMixin.class);
        context.setMixInAnnotations(BankBalanceResponse.class,BankBalanceResponseMixin.class);

    }

}
