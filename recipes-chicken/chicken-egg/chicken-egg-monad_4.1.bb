SECTION = "devel/chicken"
DESCRIPTION = "Monads"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://monad.meta;md5=d3f9116fdd1b6227f0dbedce7721e75f"
DEPENDS = " chicken-egg-monad-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/monad/monad-${PV}.tar.gz"

SRC_URI[md5sum] = "291cdb021930466611661c209627c036"
SRC_URI[sha256sum] = "00e5c1637cb344e30a3034377482cc1abdefef3a766144e1ab20b96b27489ac1"

S = "${WORKDIR}/monad-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
