package lombok;

import lombok.experimental.Delegate;

public class User implements HasContactInformation {
    @Delegate(types={HasContactInformation.class})
    private final ContactInformationSupport contactInformationSupport = new ContactInformationSupport();
}
