interface X { }

interface Y { }

class Z { }

public class Foo extends Z implements X, Y { }

//public class Foo implements Z extends X, Y { }

//public class Foo extends X, Y implements Z { }

//public class Foo implements X, Y extends Z { }