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


case class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus (
  /* conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met. */
  conditions: List[IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition],
  /* currentMetrics is the last read state of the metrics used by this autoscaler. */
  currentMetrics: List[IoK8sApiAutoscalingV2beta1MetricStatus],
  /* currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler. */
  currentReplicas: Integer,
  /* desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler. */
  desiredReplicas: Integer,
  /* lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed. */
  lastScaleTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* observedGeneration is the most recent generation observed by this autoscaler. */
  observedGeneration: Option[Long]
)
