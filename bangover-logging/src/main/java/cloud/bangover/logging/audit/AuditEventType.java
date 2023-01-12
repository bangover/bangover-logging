package cloud.bangover.logging.audit;

import cloud.bangover.errors.ErrorDescriptor;
import cloud.bangover.errors.ErrorDescriptor.ErrorCode;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This class represents the audit event type.
 *
 * @author Dmitry Mikhaylenko
 *
 */
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class AuditEventType {
  private final ErrorCode errorCode;

  /**
   * Create audit event type.
   *
   */
  public AuditEventType() {
    this(ErrorCode.SUCCESSFUL_COMPLETED_CODE);
  }

  /**
   * Create audit event type for specified error descriptor.
   *
   * @param errorDescriptor The error descriptor
   */
  public AuditEventType(ErrorDescriptor errorDescriptor) {
    this(errorDescriptor.getErrorCode());
  }
}