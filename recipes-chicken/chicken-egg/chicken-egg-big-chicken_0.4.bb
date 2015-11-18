SECTION = "devel/chicken"
DESCRIPTION = "A convenience module that re-exports most non-standard libraries"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://big-chicken.meta;md5=2dda96a4a1a122a2c4506dff3181571b"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/big-chicken/big-chicken-${PV}.tar.gz"

SRC_URI[md5sum] = "ee96bf98c585a5861f61f7fae02eb300"
SRC_URI[sha256sum] = "e80b03034e3fb8d17a30f2ccd14264bf437cc4bbb3afe5f45426f9b303499d9d"

S = "${WORKDIR}/big-chicken-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
