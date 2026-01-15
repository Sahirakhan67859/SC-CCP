class Identity {
    private final String id;

    public Identity(String id) {
        this.id = Objects.requireNonNull(id, "Identity ID cannot be null");
    }

    public String getId() { return id; }
}