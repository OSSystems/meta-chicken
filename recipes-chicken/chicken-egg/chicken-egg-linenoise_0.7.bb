SECTION = "devel/chicken"
DESCRIPTION = "A minimal, zero-config, BSD licensed, readline replacement."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://linenoise.meta;md5=a8055f5aa538c52d95acdbcd71a4c9c1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/linenoise/linenoise-${PV}.tar.gz"

SRC_URI[md5sum] = "6b3ad8bc8c05d7f89efb46434ffa7d17"
SRC_URI[sha256sum] = "59ba736f03d04517ffaafac5e5d7ac508f58ac6064373f231a5afaca8b958af9"

S = "${WORKDIR}/linenoise-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
