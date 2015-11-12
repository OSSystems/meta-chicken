SECTION = "devel/chicken"
DESCRIPTION = "fluid variables - an alternative to SRFI-39"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fluids.meta;md5=9ea62af2ed762d364a4ba4321afc1ed6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fluids/fluids-${PV}.tar.gz"

SRC_URI[md5sum] = "0aca9ce00282415177cdc6a6690d4d88"
SRC_URI[sha256sum] = "5c03f94c4bd163a5094038e8c52c8830c2dd1a871fd68acf3fba8a4d866a016b"

S = "${WORKDIR}/fluids-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
