/*
 * Copyright 2020 Google LLC
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package com.google.cloud.healthcare.fdamystudies.filter;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TokenIntrospectionFilter extends BaseTokenIntrospectionFilter {

  private Map<String, String[]> uriTemplateAndMethods = new HashMap<>();

  @Autowired ServletContext context;

  @PostConstruct
  public void init() {
    /*

      uriTemplateAndMethods.put(
          String.format("%s/participant/add", context.getContextPath()),
          new String[] {HttpMethod.POST.name()});
      uriTemplateAndMethods.put(
          String.format("%s/participant/process-response", context.getContextPath()),
          new String[] {HttpMethod.POST.name()});
      uriTemplateAndMethods.put(
          String.format("%s/participant/getresponse", context.getContextPath()),
          new String[] {HttpMethod.GET.name()});
      uriTemplateAndMethods.put(
          String.format("%s/participant/withdraw", context.getContextPath()),
          new String[] {HttpMethod.POST.name()});
      uriTemplateAndMethods.put(
          String.format("%s/participant/get-activity-state", context.getContextPath()),
          new String[] {HttpMethod.GET.name()});
      uriTemplateAndMethods.put(
          String.format("%s/participant/update-activity-state", context.getContextPath()),
          new String[] {HttpMethod.POST.name()});
      uriTemplateAndMethods.put(
          String.format("%s/studymetadata", context.getContextPath()),
          new String[] {HttpMethod.POST.name()});
    */
  }

  @Override
  protected Map<String, String[]> getUriTemplateAndHttpMethodsMap() {
    return uriTemplateAndMethods;
  }
}
