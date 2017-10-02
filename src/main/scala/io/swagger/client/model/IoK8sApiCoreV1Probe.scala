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


case class IoK8sApiCoreV1Probe (
  /* One and only one of the following should be specified. Exec specifies the action to take. */
  exec: Option[IoK8sApiCoreV1ExecAction],
  /* Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. */
  failureThreshold: Option[Integer],
  /* HTTPGet specifies the http request to perform. */
  httpGet: Option[IoK8sApiCoreV1HTTPGetAction],
  /* Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  initialDelaySeconds: Option[Integer],
  /* How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
  periodSeconds: Option[Integer],
  /* Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1. */
  successThreshold: Option[Integer],
  /* TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported */
  tcpSocket: Option[IoK8sApiCoreV1TCPSocketAction],
  /* Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
  timeoutSeconds: Option[Integer]
)
