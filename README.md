# LoginJSF

Introductory ride-sharing web application built with JSF, CDI, and Maven.

## What it covers

- registration and authentication
- ride search and publishing
- JSF views with managed beans
- ObjectDB persistence

## Architecture

JSF views submit actions to backing beans, which delegate ride and account operations to the business layer. ObjectDB provides persistence behind that layer, keeping database access out of the XHTML pages.

## Links

- DeepWiki: https://deepwiki.com/eneekoruiz/LoginJSF
