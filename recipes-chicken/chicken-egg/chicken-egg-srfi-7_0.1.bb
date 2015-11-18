SECTION = "devel/chicken"
DESCRIPTION = "SRFI-7: Feature based program configuration language"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-7.meta;md5=3f9885cd68392ac473dfd77f98e55f46"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-7/srfi-7-${PV}.tar.gz"

SRC_URI[md5sum] = "da88feabfb747e09527d4f5d5f91344e"
SRC_URI[sha256sum] = "ff01db8f9b2e90c0b04f1013a357da744b237b1b28d43bd672ea0a75c8d66106"

S = "${WORKDIR}/srfi-7-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
