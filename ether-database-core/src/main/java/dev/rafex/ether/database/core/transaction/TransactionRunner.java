package dev.rafex.ether.database.core.transaction;

public interface TransactionRunner {

    <T> T inTransaction(TransactionCallback<T> callback);
}
