# Repro of Error using RobolectricRunner with PITest

To reproduce the error. First run:

```
gradle pitest
```

The errors will look like this:

![Repro run][repro_run]

Now, we can manually try out one of the performed mutations. For example, change the statement in DeviceResolver to:

```
return buildDevice == null;
```

and then 

```
gradle test
```

We see that the normal test suite fails, but PITEst is reporting a survived mutant.

Removing the statement `@RunWith(RobolectricTestRunner.class)` makes PITest work properly again.
