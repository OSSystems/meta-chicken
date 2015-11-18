SECTION = "devel/chicken"
DESCRIPTION = "A tool to fetch eggs and dependencies sources"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://egg-pack-sources.meta;md5=b80e6727deec7116bd27d57493260650"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/egg-pack-sources/egg-pack-sources-${PV}.tar.gz"

SRC_URI[md5sum] = "b98a1df3c8602f952ad4f034db3e67e2"
SRC_URI[sha256sum] = "a7ba19f18c02b9411ff3a3d9c3f6959bcf1f910b3f178862a107180f979e7030"

S = "${WORKDIR}/egg-pack-sources-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
