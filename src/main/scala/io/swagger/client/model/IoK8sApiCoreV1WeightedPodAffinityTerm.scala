/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiCoreV1WeightedPodAffinityTerm (
  /* Required. A pod affinity term, associated with the corresponding weight. */
  podAffinityTerm: IoK8sApiCoreV1PodAffinityTerm,
  /* weight associated with matching the corresponding podAffinityTerm, in the range 1-100. */
  weight: Integer
)

