package dev.rafex.ether.database.core;

import java.util.List;
import java.util.Optional;

import dev.rafex.ether.database.core.mapping.ResultSetExtractor;
import dev.rafex.ether.database.core.mapping.RowMapper;
import dev.rafex.ether.database.core.sql.SqlQuery;
import dev.rafex.ether.database.core.sql.StatementBinder;
import dev.rafex.ether.database.core.transaction.TransactionRunner;

public interface DatabaseClient extends TransactionRunner {

    <T> T query(SqlQuery query, ResultSetExtractor<T> extractor);

    <T> List<T> queryList(SqlQuery query, RowMapper<T> mapper);

    <T> Optional<T> queryOne(SqlQuery query, RowMapper<T> mapper);

    /**
     * Executes a SQL statement (INSERT, UPDATE, DELETE, or stored procedure call).
     * 
     * @param query the SQL query to execute
     * @return the number of rows affected, or -1 if the statement returned a ResultSet
     */
    int execute(SqlQuery query);

    long[] batch(String sql, List<StatementBinder> binders);
}
