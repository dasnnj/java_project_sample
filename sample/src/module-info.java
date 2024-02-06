module sample {
    uses com.jay.base.LoggerForSpiTest;
    requires module.reference;
    opens com.jay.base;
}