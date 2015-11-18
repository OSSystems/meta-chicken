SECTION = "devel/chicken"
DESCRIPTION = "TinyCLOS wrappers for file operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://vfs.meta;md5=3372dac9bfe094d8433e9905dc9e22c7"
DEPENDS_append_class-cross = " chicken-egg-tinyclos-cross chicken-egg-regex-case-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-tinyclos-crosssdk chicken-egg-regex-case-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-tinyclos nativesdk-chicken-egg-regex-case chicken-egg-tinyclos-crosssdk chicken-egg-regex-case-crosssdk"
DEPENDS = " chicken-egg-tinyclos chicken-egg-regex-case chicken-egg-tinyclos-cross chicken-egg-regex-case-cross"
RDEPENDS_${PN} = " chicken-egg-tinyclos chicken-egg-regex-case"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/vfs/vfs-${PV}.tar.gz"

SRC_URI[md5sum] = "fd9eb2ac05f25ccd56530d1676c71efb"
SRC_URI[sha256sum] = "f3c8cadd520bdff7ab6254673e38933dd7c8ab7335c3da07eee0b8feaa9f1b0d"

S = "${WORKDIR}/vfs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
