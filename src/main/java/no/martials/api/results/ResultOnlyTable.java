package no.martials.api.results;

import no.martials.api.expressions.TruthTable;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

@Schema(name = "ResultOnlyTable", description = "Result with only the table table")
public class ResultOnlyTable extends EmptyResult {

    @NotBlank
    @NotNull
    protected final String expression;
    @Nullable
    protected final String[] header;
    @Nullable
    protected final TruthTable table;

    public ResultOnlyTable(String version, @NotNull String expression, @Nullable String[] header, @Nullable TruthTable table) {
        super(version);
        this.expression = expression;
        this.header = header;
        this.table = table;
    }

    @NotNull
    public String getExpression() {
        return expression;
    }

    @Nullable
    public String[] getHeader() {
        return header;
    }

    @Nullable
    public TruthTable getTable() {
        return table;
    }

    @Override
    public String toString() {
        return "ResultOnlyTable{" +
                "expression='" + expression + '\'' +
                ", header=" + Arrays.toString(header) +
                ", table=" + table +
                "} " + super.toString();
    }
}
