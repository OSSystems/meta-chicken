SECTION = "devel/chicken"
DESCRIPTION = "Multi-methods as a simple variant of generic functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://multi-methods.meta;md5=d4b5a96f94059928e50b2e4e8b74e3bb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/multi-methods/multi-methods-${PV}.tar.gz"

SRC_URI[md5sum] = "0a0acdac9732146df5f9946290d54db9"
SRC_URI[sha256sum] = "af8a6def640ba7ce794b0eae9e559f5023f2acad7e9439f1314c464fd0776d55"

S = "${WORKDIR}/multi-methods-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
