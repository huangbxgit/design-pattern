委派模式：用户将具体的任务委派给特殊的代理来处理，这个代理根据一定的策略来选择谁来做

委派模式是代理模式和策略模式的组合应用，spring里面大量用到委派模式，类似dispatch、delegate的类
都是委派模式

代码例子：用户去旅游，将旅游委派给旅行社，旅行社根据你想要的线路，选择相应的线路

代理模式注重的是过程，委派模式注重的是结果
策略模式注重可扩展（外部扩展），委派模式注重内部的灵活和复用
