SECTION = "devel/chicken"
DESCRIPTION = "Pathname expansion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pathname-expand.meta;md5=83051ccbc0773c14b774bc5eb37ff451"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pathname-expand/pathname-expand-${PV}.tar.gz"

SRC_URI[md5sum] = "03a60eb78ebc6f1f09d9bf69ecd063aa"
SRC_URI[sha256sum] = "e1394a3799dbf61db2f6c6ca512b4d0d15c55984d98f7bce2150694185ec4dee"

S = "${WORKDIR}/pathname-expand-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
