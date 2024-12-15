package ge.automation;

class SymbolReplacer implements ReplaceSymbolA, ReplaceSymbolB {

    @Override
    public String replaceSymbolA(String input) {
        return input.replace('a', 'z');
    }

    @Override
    public String replaceSymbolB(String input) {
        return input.replace('b', 'w');
    }
}
