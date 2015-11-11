SECTION = "devel/chicken"
DESCRIPTION = "A facility for creating and deconstructing variant records (from EOPL)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://datatype.meta;md5=9c65b1b5609c5abc7d36857cf3a09739"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/datatype/datatype-${PV}.tar.gz"

SRC_URI[md5sum] = "c7357f038427e224599f5c3f399e2137"
SRC_URI[sha256sum] = "93355406a1f6fb935e7ba863eef774e804406cb57b2362c1716d0c6a6153c8fe"

S = "${WORKDIR}/datatype-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
